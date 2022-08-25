package com.agileactors.templateservice.data.jpa.repository;

import com.agileactors.templateservice.domain.DomainObject;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainObjectRepository extends AbstractRepository<DomainObject, UUID> {
}