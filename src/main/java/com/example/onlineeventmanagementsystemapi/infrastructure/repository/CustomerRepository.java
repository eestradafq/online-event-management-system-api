package com.example.onlineeventmanagementsystemapi.infrastructure.repository;

import com.example.onlineeventmanagementsystemapi.infrastructure.repository.entity.CustomerEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<CustomerEntity, Long> {
  @Query("SELECT TOP (:limit) * FROM customers WHERE id > :cursorId ORDER BY id")
  Flux<CustomerEntity> findCustomersByCursor(Long cursorId, int limit);
}
