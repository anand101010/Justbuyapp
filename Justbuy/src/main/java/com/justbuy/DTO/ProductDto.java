package com.justbuy.DTO;

public class ProductDto {
    private int product_id;
    private float product_price;
    private  String product_name;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public byte[] getProduct_image() {
        return product_image;
    }

    public void setProduct_image(byte[] product_image) {
        this.product_image = product_image;
    }

    private byte[] product_image;

    public ProductDto(int product_id, float product_price, String product_name, byte[] product_image) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_name = product_name;
        this.product_image = product_image;
    }
}
