package com.example.onlineeventmanagementsystemapi.infrastructure.repository.entity;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Getter
@Setter
@Table(name = "front_desk_user")
public class FrontDeskUserEntity {

  @Id private Long id;
  private String username;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;
  private String createdBy;
  private String modifiedBy;
}
