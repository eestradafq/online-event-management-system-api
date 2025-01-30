package com.example.onlineeventmanagementsystemapi.domain.services;

import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import com.example.onlineeventmanagementsystemapi.domain.port.input.CustomerUseCase;
import com.example.onlineeventmanagementsystemapi.domain.port.output.CustomerRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerUseCase {
  private final CustomerRepositoryPort customerRepositoryPort;

  @Override
  public Flux<Customer> findCustomers(Long cursorId, Integer limit) {
    return this.customerRepositoryPort.findCustomers(cursorId, limit);
  }
}
