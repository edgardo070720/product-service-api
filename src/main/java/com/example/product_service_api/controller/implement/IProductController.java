package com.example.product_service_api.controller.implement;

import com.example.product_service_api.commons.entities.ProductModel;
import com.example.product_service_api.controller.IProductApi;
import com.example.product_service_api.service.IProductService;
import org.springframework.http.ResponseEntity;

public class IProductController implements IProductApi {
    private  final IProductService productService;

    public IProductController(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<ProductModel> createProduct(ProductModel createProductRequest) {
        return ResponseEntity.ok(productService.createProduct(createProductRequest));
    }

    @Override
    public ResponseEntity<ProductModel> getProduct(long productId) {
        ProductModel product=productService.getProduct(productId);
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<Void> updateProduct(ProductModel updateProduct, long productId) {
        productService.updateProduct(updateProduct,productId);
        return ResponseEntity.noContent().build();
    }
}
