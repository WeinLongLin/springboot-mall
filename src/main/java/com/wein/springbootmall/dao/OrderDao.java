package com.wein.springbootmall.dao;

import com.wein.springbootmall.dto.CreateOrderRequest;
import com.wein.springbootmall.dto.OrderQueryParams;
import com.wein.springbootmall.model.Order;
import com.wein.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemByOrderId(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
