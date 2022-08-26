package com.agileactors.templateservice.domain;

import com.agileactors.crud.domain.AbstractUpdatable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domain_object")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
// TODO: Find a better way to declare the id since it is quite generic
public class DomainObject extends AbstractUpdatable<UUID> {
  @Id
  @Column(name = "domain_object_id")
  private UUID id;

  private String mandatoryDummyField;

  private String optionalDummyField;
}

