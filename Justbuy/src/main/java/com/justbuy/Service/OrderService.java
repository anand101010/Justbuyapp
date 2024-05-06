package com.justbuy.Service;

import com.justbuy.model.Orders;

import java.util.List;

public interface OrderService {
    Orders saveOrders(Orders orders);
    List<Orders> GetAllOrders();

    List<Orders> getOrdersByStatus(String orderStatus);
    List<Orders>getOrdersByIdGreaterThan(long order_id);
  List<Object[]> getOrderByState(String state);
  List<Object[]>getOrderBystate1(String state);

  Orders getOrderBYId(long id);
}
