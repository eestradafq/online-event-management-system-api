package com.example.onlineeventmanagementsystemapi.infrastructure;

import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import com.example.onlineeventmanagementsystemapi.domain.port.output.CustomerRepositoryPort;
import com.example.onlineeventmanagementsystemapi.infrastructure.repository.CustomerRepository;
import com.example.onlineeventmanagementsystemapi.infrastructure.repository.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class CustomerAdapter implements CustomerRepositoryPort {
  private final CustomerRepository customerRepository;
  private final CustomerMapper customerMapper;

  @Override
  public Flux<Customer> findCustomers(Long cursorId, Integer limit) {
    return this.customerRepository
        .findCustomersByCursor(cursorId, limit)
        .map(this.customerMapper::toCustomer);
  }
}
