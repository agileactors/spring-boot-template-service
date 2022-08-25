package com.agileactors.templateservice.dto;

import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class UpdateDomainObjectRequestDto extends AbstractUpdateRequestResourceDto<UUID> {

  private final String mandatoryDummyField;
  private final String optionalDummyField;

  public UpdateDomainObjectRequestDto(UUID id, String mandatoryDummyField,
                                      String optionalDummyField) {
    super(id);
    this.mandatoryDummyField = mandatoryDummyField;
    this.optionalDummyField = optionalDummyField;
  }
}
