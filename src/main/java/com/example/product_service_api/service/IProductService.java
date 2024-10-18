package com.example.product_service_api.service;

import com.example.product_service_api.commons.entities.ProductModel;

public interface IProductService {
    ProductModel createProduct(ProductModel createProductRequest);
    ProductModel getProduct(long productId);
}
