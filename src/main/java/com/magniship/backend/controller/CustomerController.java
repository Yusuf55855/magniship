package com.magniship.backend.controller;

import org.springframework.web.bind.annotation.*;

import com.magniship.backend.entity.Customer;
import com.magniship.backend.repository.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
  private final CustomerRepository customerRepository;

  public CustomerController(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping
  public List<Customer> getAll() {
    return customerRepository.findAll();
  }

  @PostMapping
  public Customer save(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }
}
