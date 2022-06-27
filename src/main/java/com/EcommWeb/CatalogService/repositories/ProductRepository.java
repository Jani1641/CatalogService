package com.EcommWeb.CatalogService.repositories;

import com.EcommWeb.CatalogService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
}
