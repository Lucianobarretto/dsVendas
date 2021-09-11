package com.lucianobarreto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianobarreto.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
