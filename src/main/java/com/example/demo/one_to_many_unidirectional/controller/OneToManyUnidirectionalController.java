package com.example.demo.one_to_many_unidirectional.controller;


import com.example.demo.one_to_many_unidirectional.entity.Order;
import com.example.demo.one_to_many_unidirectional.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class OneToManyUnidirectionalController {
    private final OrderRepository orderRepository;

    @PostMapping("/orders")
    public Order saveOrders(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping("/orders")
    public List<Order> orders() {
        return orderRepository.findAll();
    }
}
