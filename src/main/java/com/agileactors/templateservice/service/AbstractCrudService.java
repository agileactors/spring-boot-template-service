package com.agileactors.templateservice.service;

import com.agileactors.templateservice.domain.AbstractPersistable;
import com.agileactors.templateservice.dto.AbstractCreateResourceRequestDto;
import com.agileactors.templateservice.dto.AbstractUpdateRequestResourceDto;
import com.agileactors.templateservice.exception.DomainResourceNotFoundException;
import com.agileactors.templateservice.exception.MappingNotFoundException;
import java.io.Serializable;
import java.util.List;

public interface AbstractCrudService<T extends AbstractPersistable<I>, I extends Serializable> {
  List<T> findAll();

  T getById(I id) throws DomainResourceNotFoundException;

  void deleteById(I id);

  <C extends AbstractCreateResourceRequestDto> T create(C createDto)
      throws MappingNotFoundException;

  <U extends AbstractUpdateRequestResourceDto<I>> T update(U updateDto)
      throws MappingNotFoundException;
}
