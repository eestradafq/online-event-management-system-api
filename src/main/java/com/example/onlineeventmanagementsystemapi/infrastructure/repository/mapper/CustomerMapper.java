package com.example.onlineeventmanagementsystemapi.infrastructure.repository.mapper;

import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import com.example.onlineeventmanagementsystemapi.infrastructure.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {
  Customer toCustomer(CustomerEntity customerEntity);
}
