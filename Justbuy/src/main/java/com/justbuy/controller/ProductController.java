package com.justbuy.controller;

import com.justbuy.Service.ProductService;
import com.justbuy.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/product/api")
@Api("Product controller class")
public class ProductController {
    @Autowired
    public ProductService productService;

@ApiOperation("Save product")
    @PostMapping("/postproduct")
    public ResponseEntity<Product> postProduct(@RequestParam("name") String name,
                                               @RequestParam("price") float price,
                                               @RequestParam("image") MultipartFile imageFile) {
        try {
            Product aa = new Product();
            aa.setProduct_name(name);
            aa.setProduct_price(price);
            aa.setProduct_image(imageFile.getBytes());
            Product savedProduct = productService.saveProduct(aa);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (IOException e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);


        }

    }
    @ApiOperation("get all products")
    @GetMapping("/getallproduct")
    public List<Product> getAllProduct(){
        return productService.GetAllProduct();
    }
}
