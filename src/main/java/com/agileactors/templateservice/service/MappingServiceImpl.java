package com.agileactors.templateservice.service;

import com.agileactors.templateservice.properties.SpringRestProperties;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnBean(SpringRestProperties.class)
@RequiredArgsConstructor
public class MappingServiceImpl implements MappingService {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  private final SpringRestProperties springRestProperties;

  public Class<?> getResponseMappingType(Class<?> type, String mappingType) {

    String mappingKey = type.getName() + mappingType;

    try {
      return Class.forName(springRestProperties.getMappings().get(mappingKey));
    } catch (ClassNotFoundException ex) {
      logger.error(String.format("Mapping %s not found", mappingKey));
      return null;
    }
  }
}