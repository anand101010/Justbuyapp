package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.Service.OrderService;
import com.bezkoder.spring.datajpa.model.Orders;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.User;
import com.bezkoder.spring.datajpa.repository.OrderRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.query.criteria.internal.expression.SimpleCaseExpression;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
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
