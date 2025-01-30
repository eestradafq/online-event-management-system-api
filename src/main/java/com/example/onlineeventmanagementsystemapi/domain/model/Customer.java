package com.example.onlineeventmanagementsystemapi.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {
  private Long id;
  private String name;
  private String address;
  private String phone;
  private String email;
  private String type;
  private Boolean status;
}
