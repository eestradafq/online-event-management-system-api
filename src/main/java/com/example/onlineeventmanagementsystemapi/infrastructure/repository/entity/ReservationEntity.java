package com.example.onlineeventmanagementsystemapi.infrastructure.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@Table(name = "reservations")
public class ReservationEntity {
    private Long id;
    private Long userId;
    private Integer guestCount;
    private LocalDateTime reservationDate;
    private String status;
    private String comments;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String createdBy;
    private String modifiedBy;
}
