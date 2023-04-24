package com.wein.springbootmall.service;

import com.wein.springbootmall.dto.CreateOrderRequest;
import com.wein.springbootmall.dto.OrderQueryParams;
import com.wein.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
