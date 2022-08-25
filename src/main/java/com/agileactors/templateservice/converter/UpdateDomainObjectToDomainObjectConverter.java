package com.agileactors.templateservice.converter;

import com.agileactors.templateservice.domain.DomainObject;
import com.agileactors.templateservice.dto.UpdateDomainObjectRequestDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UpdateDomainObjectToDomainObjectConverter
    implements Converter<UpdateDomainObjectRequestDto, DomainObject> {

  @Override
  public DomainObject convert(UpdateDomainObjectRequestDto source) {
    return new DomainObject(source.getId(), source.getMandatoryDummyField(),
        source.getOptionalDummyField());
  }
}
