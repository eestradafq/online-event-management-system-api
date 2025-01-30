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
@Table(name = "customers")
public class CustomerEntity {

  @Id private Long id;
  private String name;
  private String address;
  private String phone;
  private String email;
  private String type;
  private Boolean status;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;
  private String createdBy;
  private String modifiedBy;
}
