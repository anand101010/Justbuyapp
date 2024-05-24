package com.justbuy.DTO;

import com.justbuy.model.Product;
import com.justbuy.model.User;

public class OrderDto {
    private long order_id;
    private float order_price ;
    private String order_address ;
    private String  order_status ;

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public float getOrder_price() {
        return order_price;
    }

    public void setOrder_price(float order_price) {
        this.order_price = order_price;
    }

    public String getOrder_address() {
        return order_address;
    }

    public void setOrder_address(String order_address) {
        this.order_address = order_address;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    private ProductDto product;
    private UserDto user;

    public OrderDto(long order_id, float order_price, String order_address, String order_status, ProductDto product, UserDto user) {
        this.order_id = order_id;
        this.order_price = order_price;
        this.order_address = order_address;
        this.order_status = order_status;
        this.product = product;
        this.user = user;
    }
}
