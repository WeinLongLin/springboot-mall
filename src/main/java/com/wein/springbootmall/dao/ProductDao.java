package com.wein.springbootmall.dao;

import com.wein.springbootmall.dto.ProductRequest;
import com.wein.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}