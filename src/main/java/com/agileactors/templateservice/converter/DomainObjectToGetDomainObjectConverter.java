package com.agileactors.templateservice.converter;

import com.agileactors.templateservice.domain.DomainObject;
import com.agileactors.templateservice.dto.GetDomainObjectResponseDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DomainObjectToGetDomainObjectConverter
    implements Converter<DomainObject, GetDomainObjectResponseDto> {
  @Override
  public GetDomainObjectResponseDto convert(DomainObject source) {
    return new GetDomainObjectResponseDto(source.getId(), source.getCreatedAt(),
        source.getUpdatedAt(), source.getMandatoryDummyField(), source.getOptionalDummyField());
  }
}
