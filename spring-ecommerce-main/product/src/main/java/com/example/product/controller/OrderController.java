package com.example.product.controller;

import com.example.product.entity.Order;
import com.example.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }

    @GetMapping("/order")
    public ModelAndView orderHome(Model model) {
        model.addAttribute("order", new Order());
        return new ModelAndView("orderform");
    }
//    public ModelAndView getAllOrders(){
//        return
//    }

    @PostMapping("/saveOrder")
    public ModelAndView saveOrder(@ModelAttribute Order order) {

        Order addedOrder = orderService.saveOrder(order);
        return new ModelAndView(new RedirectView("/findOrder/" + addedOrder.getOrderId()));

    }

    @GetMapping("/deleteOrder/{id}")
    public ModelAndView deleteOrder(@PathVariable("id") int id) {
        orderService.deleteOrder(id);
        return new ModelAndView(new RedirectView("/order"));

    }

    @GetMapping("/findOrder/{id}")
    public ModelAndView findOrder(@PathVariable("id") int id, Model model) {
        Optional<Order> order = this.orderService.findOrder(id);

        order.ifPresent(value -> model.addAttribute("order", value));

        return new ModelAndView("order");
    }

}
