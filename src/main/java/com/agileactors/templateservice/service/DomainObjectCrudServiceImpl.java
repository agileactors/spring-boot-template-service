package com.agileactors.templateservice.service;

import com.agileactors.templateservice.dao.DomainObjectDao;
import com.agileactors.templateservice.domain.DomainObject;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class DomainObjectCrudServiceImpl
    extends AbstractCrudServiceImpl<DomainObject, DomainObjectDao, UUID>
    implements DomainObjectCrudService {

  public DomainObjectCrudServiceImpl(DomainObjectDao dao) {
    super(dao);
  }
}
