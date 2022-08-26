package com.agileactors.templateservice.dto;

import com.agileactors.crud.dto.AbstractCreateResourceRequestDto;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateDomainObjectRequestDto extends AbstractCreateResourceRequestDto {
  @NotBlank
  @Size(max = 2000)
  private String mandatoryDummyField;

  @Size(max = 2000)
  private String optionalDummyField;
}
