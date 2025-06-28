package com.magniship.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magniship.backend.entity.Barang;

public interface BarangRepository extends JpaRepository<Barang, Long> {
  // Bisa tambah query custom di sini jika perlu
}
