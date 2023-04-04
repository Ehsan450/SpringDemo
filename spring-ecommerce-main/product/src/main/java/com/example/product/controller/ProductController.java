package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public String form(Model model){
        Product product=new Product();
        model.addAttribute("Product", product);
        return "productform";
    }

    @PostMapping("/save")
    public void save(@ModelAttribute Product product){

        productService.saveProduct(product);
        System.out.println(product);
        System.out.println("Saved!!");

    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        productService.deleteProduct(id);


    }
    @GetMapping("/find/{id}")
    public void findProduct(@PathVariable("id") int id){
        productService.findProduct(id);
    }
}
