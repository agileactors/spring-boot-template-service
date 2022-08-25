package com.agileactors.templateservice.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class GetDomainObjectResponseDto extends AbstractGetResourceResponseDto<UUID> {
  private final String mandatoryDummyField;
  private final String optionalDummyField;

  public GetDomainObjectResponseDto(UUID id, LocalDateTime createdAt, LocalDateTime updatedAt,
                                    String mandatoryDummyField, String optionalDummyField) {
    super(id, createdAt, updatedAt);
    this.mandatoryDummyField = mandatoryDummyField;
    this.optionalDummyField = optionalDummyField;
  }
}
