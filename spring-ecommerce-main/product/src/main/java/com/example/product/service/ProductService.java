package com.example.product.service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public void saveProduct(Product product){
        productRepository.save(product);

    }
   public void deleteProduct(int product_id){
        productRepository.deleteById(product_id);
   }

   public void findProduct(int id){
        productRepository.findById(id);

   }
}
