package com.agileactors.templateservice.dao;

import com.agileactors.templateservice.data.jpa.repository.DomainObjectRepository;
import com.agileactors.templateservice.domain.DomainObject;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
class DomainObjectDaoImpl extends
    AbstractDaoImpl<DomainObject, UUID, DomainObjectRepository> implements DomainObjectDao {
  public DomainObjectDaoImpl(DomainObjectRepository jpaRepository) {
    super(jpaRepository);
  }
}
