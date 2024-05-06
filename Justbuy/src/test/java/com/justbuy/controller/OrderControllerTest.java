package com.justbuy.controller;

import com.justbuy.Service.OrderService;
import com.justbuy.model.Orders;
import com.justbuy.model.Product;
import com.justbuy.model.User;
import com.justbuy.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTest {

    @InjectMocks
    private OrderService orderService;
    @MockBean
    private OrderRepository orderRepository;
@Test
public void  testGetAllOrder(){
when(orderRepository.findAll()).thenReturn((List<Orders>) Stream.of(new Orders(1,20.0f,"koll","fin", new Product(1,20.0f,"soap"),new User(1,"anand","koll","aaakd","asdf",6786)),new Orders(1,20.0f,"koll","fin", new Product(1,20.0f,"soap"),new User(1,"anand","koll","aaakd","asdf",6786))).collect(Collectors.toList()));
assertEquals(1,orderService.GetAllOrders().size());



}


}
