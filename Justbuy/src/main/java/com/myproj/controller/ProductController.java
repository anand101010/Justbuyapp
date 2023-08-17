package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.Service.ProductService;
import com.bezkoder.spring.datajpa.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api")
public class ProductController {
   @Autowired
   public ProductService productService;

    @PostMapping("/postproduct")
    public ResponseEntity<Product>postProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.ACCEPTED);

    }
    @GetMapping("/getallproduct")
    public List<Product> getAllProduct(){
        return productService.GetAllProduct();
    }
}
