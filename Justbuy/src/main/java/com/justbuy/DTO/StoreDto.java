package com.justbuy.DTO;

public class StoreDto {
    private int store_id;
    private String store_location;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public StoreDto(int store_id, String store_location) {
        this.store_id = store_id;
        this.store_location = store_location;
    }
}
