package com.agileactors.templateservice.service;

import com.agileactors.templateservice.exception.MappingNotFoundException;

public interface MappingService {
  Class<?> getResponseMappingType(Class<?> type, String mappingType)
      throws MappingNotFoundException;
}
