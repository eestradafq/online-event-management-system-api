package com.example.onlineeventmanagementsystemapi.domain.port.output;

import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import reactor.core.publisher.Flux;

public interface CustomerRepositoryPort {
  Flux<Customer> findCustomers(Long cursorId, Integer limit);
}
