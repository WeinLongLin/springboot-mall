package com.wein.springbootmall.service;

import com.wein.springbootmall.dto.ProductRequest;
import com.wein.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
