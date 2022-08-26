package com.agileactors.templateservice.api;

import com.agileactors.crud.api.AbstractCrudApi;
import com.agileactors.templateservice.domain.DomainObject;
import com.agileactors.templateservice.dto.CreateDomainObjectRequestDto;
import com.agileactors.templateservice.dto.GetDomainObjectResponseDto;
import com.agileactors.templateservice.dto.UpdateDomainObjectRequestDto;
import com.agileactors.templateservice.service.DomainObjectCrudService;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domainobjects")
public class DomainObjectApi extends AbstractCrudApi<
    DomainObject,
    UUID,
    DomainObjectCrudService,
    CreateDomainObjectRequestDto,
    UpdateDomainObjectRequestDto,
    GetDomainObjectResponseDto
    > {

}
