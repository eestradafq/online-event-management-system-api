package com.example.onlineeventmanagementsystemapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class CustomerResponseDto {
  private Long id;
  private String name;
  private String address;
  private String phone;
  private String email;
  private String type;
  private Boolean status;
}
