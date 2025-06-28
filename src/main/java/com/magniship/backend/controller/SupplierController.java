package com.magniship.backend.controller;

import org.springframework.web.bind.annotation.*;

import com.magniship.backend.entity.Supplier;
import com.magniship.backend.repository.SupplierRepository;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
  private final SupplierRepository supplierRepository;

  public SupplierController(SupplierRepository supplierRepository) {
    this.supplierRepository = supplierRepository;
  }

  @GetMapping
  public List<Supplier> getAll() {
    return supplierRepository.findAll();
  }

  @PostMapping
  public Supplier save(@RequestBody Supplier supplier) {
    return supplierRepository.save(supplier);
  }
}
