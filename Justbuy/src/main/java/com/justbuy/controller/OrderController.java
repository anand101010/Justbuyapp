package com.justbuy.controller;

import com.justbuy.Service.OrderService;
import com.justbuy.model.Orders;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order/api")
@Api("Order controller class")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
@ApiOperation("Save  Orders")
    @PostMapping("/postorder")
    public ResponseEntity<Orders> saveOrder(@RequestBody Orders orders) {
        return new ResponseEntity<Orders>(orderService.saveOrders(orders), HttpStatus.ACCEPTED);
    }
@ApiOperation("Get all orders")
    @GetMapping("/getallorder")
    public List<Orders> getAll() {
        return  orderService.GetAllOrders();
    }

    @ApiOperation("Get  orders by status")
    @GetMapping("/orderstatus/{orderstatus}")
    public List<Orders> getByStatus(@PathVariable("orderstatus") String orderstatus ){
        return  orderService.getOrdersByStatus(orderstatus);
    }
    @ApiOperation("get  orders lesser than : id")
    @GetMapping("/lesser/{id}")
    public List<Orders>getIdlesserthan(@PathVariable long id){

        return orderService.getOrdersByIdGreaterThan(id);
    }
    @ApiOperation("Get  orders by state")
    @GetMapping("/get/{state}")
    public  List<Object[]>getOrderByState(@PathVariable("state") String state){
        return orderService.getOrderByState(state);

    }
    @ApiOperation("Get  orders by id")
   @GetMapping("/{id}")
public Orders getOrderById(@PathVariable long id){
        return orderService.getOrderBYId(id);
   }
}

