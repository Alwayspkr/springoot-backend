package com.javatechie.controller;

import com.javatechie.entity.Product;
import com.javatechie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController  {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);


    }
@GetMapping("/products")
    public  List<Product> findAllProducts(){
        return productService.getProducts();
    }

//    @GetMapping("/product/{id}")
//    public Product findProductById(@PathVariable int id){
//        return productService.getProductbyId(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name){
//        return productService.getProductbyName(name);
//    }
//
//    public String deleteProduct(@PathVariable int id){
//        return productService.deleteProduct(id);
//    }

}
