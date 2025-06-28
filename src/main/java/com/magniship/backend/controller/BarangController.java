package com.magniship.backend.controller;

import org.springframework.web.bind.annotation.*;

import com.magniship.backend.entity.Barang;
import com.magniship.backend.service.BarangService;

import java.util.List;

@RestController
@RequestMapping("/api/barang")
public class BarangController {
  private final BarangService barangService;

  public BarangController(BarangService barangService) {
    this.barangService = barangService;
  }

  @GetMapping
  public List<Barang> getAll() {
    return barangService.getAll();
  }

  @PostMapping
  public Barang save(@RequestBody Barang barang) {
    return barangService.save(barang);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    barangService.delete(id);
  }
}
