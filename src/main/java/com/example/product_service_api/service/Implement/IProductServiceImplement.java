package com.example.product_service_api.service.Implement;

import com.example.product_service_api.commons.entities.ProductModel;
import com.example.product_service_api.repository.IProductRepository;
import com.example.product_service_api.service.IProductService;

import java.util.Optional;

public class IProductServiceImplement implements IProductService {
    private final IProductRepository productRepository;

    public IProductServiceImplement(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductModel createProduct(ProductModel createProductRequest) {
        return Optional.of(createProductRequest).map(this::mapToEntity).map(productRepository::save).orElseThrow(()->new RuntimeException("error creating the product"));
    }

    @Override
    public ProductModel getProduct(long productId) {
        return Optional.of(productId).flatMap(productRepository::findById).orElseThrow(()->new RuntimeException("error product not fond"));
    }

    private ProductModel mapToEntity(ProductModel productModel){
        return new ProductModel.productModelBuilder().nameProduct(productModel.getNameProduct()).build();
    }
}
