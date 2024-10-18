package com.example.product_service_api.repository;

import com.example.product_service_api.commons.entities.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductModel, Long>{
}
