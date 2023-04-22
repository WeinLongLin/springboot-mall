package com.wein.springbootmall.service;

import com.wein.springbootmall.constant.ProductCategory;
import com.wein.springbootmall.dto.ProductRequest;
import com.wein.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
