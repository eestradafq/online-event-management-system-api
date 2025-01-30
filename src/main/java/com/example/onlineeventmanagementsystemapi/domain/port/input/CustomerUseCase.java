package com.example.onlineeventmanagementsystemapi.domain.port.input;

import com.example.onlineeventmanagementsystemapi.domain.model.Customer;
import reactor.core.publisher.Flux;

public interface CustomerUseCase {
  Flux<Customer> findCustomers(Long cursorId, Integer limit);
}
