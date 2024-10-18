package com.example.product_service_api.commons.entities;

public interface IProductModelBuilder {
    IProductModelBuilder productId(Long productId);
    IProductModelBuilder nameProduct(String nameProduct);
    ProductModel build();
}
