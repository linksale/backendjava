package com.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdv.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
