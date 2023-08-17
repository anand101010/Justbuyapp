package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.Service.OrderService;
import com.bezkoder.spring.datajpa.model.Orders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order/api")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/postorder")
    public ResponseEntity<Orders> saveOrder(@RequestBody Orders orders) {
        return new ResponseEntity<Orders>(orderService.saveOrders(orders), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getallorder")
    public List<Orders> getAll() {
        return  orderService.GetAllOrders();
    }
    @GetMapping("/orderstatus/{orderstatus}")
    public List<Orders> getByStatus(@PathVariable("orderstatus") String orderstatus ){
        return  orderService.getOrdersByStatus(orderstatus);
    }
    @GetMapping("/lesser/{id}")
    public List<Orders>getIdlesserthan(@PathVariable long id){
        return orderService.getOrdersByIdGreaterThan(id);
    }
    @GetMapping("/get/{state}")
    public  List<Object[]>getOrderByState(@PathVariable("state") String state){
        return orderService.getOrderByState(state);

    }
    @GetMapping("/{id}")
    public List<Object[]>getfulldetails(@PathVariable("id") long id){
        return orderService.getFullDetailsById(id);
    }


}

