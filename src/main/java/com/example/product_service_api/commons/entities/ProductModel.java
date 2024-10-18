package com.example.product_service_api.commons.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long productId;
    private String nameProduct;

    public ProductModel(Long productId, String nameProduct) {
        this.productId = productId;
        this.nameProduct = nameProduct;
    }

    public ProductModel() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "productModel{" +
                "productId=" + productId +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }

    public  static  class  productModelBuilder implements IProductModelBuilder{
        private  Long productId;
        private String nameProduct;

        public productModelBuilder() {
        }

        @Override
        public IProductModelBuilder productId(Long productId) {
            this.productId= productId;
            return this;
        }

        @Override
        public IProductModelBuilder nameProduct(String nameProduct) {
            this.nameProduct=nameProduct;
            return this;
        }

        @Override
        public ProductModel build() {
            return new ProductModel(this.productId,this.nameProduct);
        }
    }

}
