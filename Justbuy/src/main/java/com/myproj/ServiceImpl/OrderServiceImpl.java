package com.bezkoder.spring.datajpa.ServiceImpl;

import com.bezkoder.spring.datajpa.Exception.NotFoundException;
import com.bezkoder.spring.datajpa.Service.OrderService;
import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    public OrderRepository orderRepository;
    @Override
    public Orders saveOrders(Orders orders){
        return  orderRepository.save(orders);



    }

    @Override
    public List<Orders> GetAllOrders() {
return  orderRepository.findAll();
    }


    @Override
    public List<Orders> getOrdersByStatus(String orderStatus) {
        if(orderRepository.getOrdersByStatus(orderStatus).isEmpty()){
            throw new NotFoundException("no order found by this status: " + orderStatus);
        }
        return orderRepository.getOrdersByStatus(orderStatus);
    }

    @Override
    public List<Orders> getOrdersByIdGreaterThan(long order_id) {
        return orderRepository.getOrdersByIdLesserThan(order_id);
    }

    @Override
    public List<Object[]> getOrderByState(String state) {
        if(orderRepository.getOrderByState(state).isEmpty()){
            throw  new NotFoundException("no order found by this state :"+" " + state);
        }

        return orderRepository.getOrderByState(state);
    }

    @Override
    public List<Object[]> getOrderBystate1(String state) {


        List<Object[]>aa=orderRepository.getOrderBYstate1(state);
        return aa;
    }

    @Override
    public List<Object[]> getFullDetailsById(long id) {
        if(orderRepository.getFullDetailsById(id).isEmpty())throw new NotFoundException("Order Doesn't Exist");
        return orderRepository.getFullDetailsById(id);
    }


}
