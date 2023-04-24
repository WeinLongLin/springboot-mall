package com.wein.springbootmall.service;

import com.wein.springbootmall.dto.CreateOrderRequest;
import com.wein.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
