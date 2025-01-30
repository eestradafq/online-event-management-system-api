package com.example.onlineeventmanagementsystemapi.application.controller;

import com.example.onlineeventmanagementsystemapi.application.dto.ApiResponse;
import com.example.onlineeventmanagementsystemapi.application.dto.CustomerResponseDto;
import com.example.onlineeventmanagementsystemapi.application.mapper.CustomerInitMapper;
import com.example.onlineeventmanagementsystemapi.domain.port.output.CustomerRepositoryPort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
  private final CustomerRepositoryPort customerRepositoryPort;
  private final CustomerInitMapper customerInitMapper;

  @GetMapping("/paginated")
  public Mono<ApiResponse<List<CustomerResponseDto>>> getCustomers(
      @RequestParam(value = "cursor", defaultValue = "0") Long cursor,
      @RequestParam(value = "limit", defaultValue = "10") Integer limit) {

    return this.customerRepositoryPort
        .findCustomers(cursor, limit)
        .map(this.customerInitMapper::toCustomerResponseDto)
        .collectList()
        .map(ApiResponse::new);
  }
}
