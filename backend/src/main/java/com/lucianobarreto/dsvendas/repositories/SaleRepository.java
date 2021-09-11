package com.lucianobarreto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobarreto.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
