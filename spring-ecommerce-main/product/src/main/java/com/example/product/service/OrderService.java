package com.example.product.service;

import com.example.product.entity.Order;
import com.example.product.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    public OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;

    }

    public void deleteOrder(int id) {
        orderRepository.deleteById(id);

    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);

    }

    public Optional<Order> findOrder(int id) {
        return orderRepository.findById(id);
    }
}
