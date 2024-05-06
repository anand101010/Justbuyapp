package com.justbuy.controller;

import com.justbuy.Service.ProductStoreService;
import com.justbuy.model.ProductStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productstore/api")
public class ProductStoreController {
    @Autowired
    ProductStoreService productStoreService;
    @PostMapping("/postproductstore")
    public ResponseEntity<ProductStore>postProduct(@RequestBody ProductStore productStore){
        return new ResponseEntity<ProductStore>(productStoreService.saveProductstore(productStore), HttpStatus.ACCEPTED);
    }
}
