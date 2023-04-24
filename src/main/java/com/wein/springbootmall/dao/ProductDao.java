package com.wein.springbootmall.dao;

import com.wein.springbootmall.constant.ProductCategory;
import com.wein.springbootmall.dto.ProductQueryParams;
import com.wein.springbootmall.dto.ProductRequest;
import com.wein.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);

    void updateStock(Integer productId, Integer stock);
}
