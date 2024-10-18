package com.example.product_service_api.controller;

import com.example.product_service_api.commons.constants.ApiPathConstans;
import com.example.product_service_api.commons.entities.ProductModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathConstans.V1_ROUTE+ApiPathConstans.PRODUCT_ROUTE)
public interface IProductApi {
    @PostMapping(value = "/create")
    ResponseEntity<ProductModel> createProduct(
            @RequestBody ProductModel createProductRequest
    );
    @GetMapping(value = "/{productId}")
    ResponseEntity<ProductModel> getProduct(
            @PathVariable long productId
    );
}
