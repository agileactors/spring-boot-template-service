package com.agileactors.templateservice.service;

import com.agileactors.templateservice.dao.AbstractDao;
import com.agileactors.templateservice.domain.AbstractPersistable;
import com.agileactors.templateservice.dto.AbstractCreateResourceRequestDto;
import com.agileactors.templateservice.dto.AbstractUpdateRequestResourceDto;
import com.agileactors.templateservice.exception.DomainResourceNotFoundException;
import com.agileactors.templateservice.exception.MappingNotFoundException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

@MappedSuperclass
abstract class AbstractCrudServiceImpl<
    T extends AbstractPersistable<I>,
    D extends AbstractDao<T, I>,
    I extends Serializable> implements AbstractCrudService<T, I> {

  private final D dao;

  @Autowired
  private MappingService mappingService;
  @Autowired
  private ConversionService conversionService;

  public AbstractCrudServiceImpl(D dao) {
    this.dao = dao;
  }

  @Override
  public List<T> findAll() {
    return dao.findAll();
  }

  @Override
  public T getById(I id) throws DomainResourceNotFoundException {
    return dao.findById(id)
        .orElseThrow(() -> new DomainResourceNotFoundException("Resource not found", id));
  }

  @Override
  public void deleteById(I id) {
    dao.deleteById(id);
  }

  @Override
  public <C extends AbstractCreateResourceRequestDto> T create(C createDto)
      throws MappingNotFoundException {
    T newEntity = (T) conversionService.convert(createDto,
        mappingService.getResponseMappingType(createDto.getClass(), ".domain"));
    return dao.save(newEntity);
  }

  @Override
  public <U extends AbstractUpdateRequestResourceDto<I>> T update(U updateDto)
      throws MappingNotFoundException {
    T newEntity = (T) conversionService.convert(updateDto,
        mappingService.getResponseMappingType(updateDto.getClass(), ".domain"));
    return dao.save(newEntity);
  }
}
