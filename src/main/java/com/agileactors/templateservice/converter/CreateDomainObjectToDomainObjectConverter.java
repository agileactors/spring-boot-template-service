package com.agileactors.templateservice.converter;

import com.agileactors.templateservice.domain.DomainObject;
import com.agileactors.templateservice.dto.CreateDomainObjectRequestDto;
import java.util.UUID;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CreateDomainObjectToDomainObjectConverter
    implements Converter<CreateDomainObjectRequestDto, DomainObject> {
  @Override
  public DomainObject convert(CreateDomainObjectRequestDto source) {
    return new DomainObject(UUID.randomUUID(), source.getMandatoryDummyField(),
        source.getOptionalDummyField());
  }
}
