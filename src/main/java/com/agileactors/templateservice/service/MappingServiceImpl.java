package com.agileactors.templateservice.service;

import com.agileactors.templateservice.properties.SpringRestProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean(SpringRestProperties.class)
@RequiredArgsConstructor
public class MappingServiceImpl implements MappingService {

  private final SpringRestProperties springRestProperties;

  public Class<?> getResponseMappingType(Class<?> type, String mappingType) {
    try {
      return Class.forName(springRestProperties.getMappings().get(type.getName() + mappingType));
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
