package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.Service.ProductService;
import com.bezkoder.spring.datajpa.Service.StoreService;
import com.bezkoder.spring.datajpa.model.Product;
import com.bezkoder.spring.datajpa.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/store/api")
@RestController
public class StoreController {
  @Autowired
  public StoreService storeService;


    @PostMapping("/poststore")
    public ResponseEntity<Store> postProduct(@RequestBody Store store){
        return new ResponseEntity<Store>(storeService.saveStore(store), HttpStatus.ACCEPTED);

    }
    @GetMapping("/getAllStore")
    public List<Store> getAllStore(){
        return storeService.GetAllStore();
    }
}
