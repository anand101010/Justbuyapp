package com.bezkoder.spring.datajpa.Service;

import com.bezkoder.spring.datajpa.model.Orders;

import java.util.List;

public interface OrderService {
    Orders saveOrders(Orders orders);
    List<Orders> GetAllOrders();

    List<Orders> getOrdersByStatus(String orderStatus);
    List<Orders>getOrdersByIdGreaterThan(long order_id);
  List<Object[]> getOrderByState(String state);
  List<Object[]>getOrderBystate1(String state);
  List<Object[]> getFullDetailsById(long id);
}
