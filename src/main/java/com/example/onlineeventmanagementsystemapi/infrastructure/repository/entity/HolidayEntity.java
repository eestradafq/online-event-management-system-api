package com.example.onlineeventmanagementsystemapi.infrastructure.repository.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Getter
@Setter
@Table(name = "holiday")
public class HolidayEntity {
  private Long id;
  private LocalDate holidayDate;
  private String reason;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;
  private String createdBy;
  private String modifiedBy;
}
