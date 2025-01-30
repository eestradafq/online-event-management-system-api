package com.example.onlineeventmanagementsystemapi.application.mapper;

import com.example.onlineeventmanagementsystemapi.application.dto.CustomerResponseDto;
import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerInitMapper {
  CustomerResponseDto toCustomerResponseDto(Customer customer);
}
