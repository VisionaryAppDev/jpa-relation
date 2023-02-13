package com.example.demo.one_to_many_bidirectional.controller;

import com.example.demo.one_to_many_bidirectional.entity.Customer;
import com.example.demo.one_to_many_bidirectional.entity.Feedback;
import com.example.demo.one_to_many_bidirectional.repository.CustomerRepository;
import com.example.demo.one_to_many_bidirectional.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class OneToManyBidirectionalController {
    private final CustomerRepository customerRepository;
    private final FeedbackRepository feedbackRepository;

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
        /// Feedback has @JsonIgnore on Customer field. So, we must add it manually
        customer.getFeedbacks().forEach(feedback -> feedback.setCustomer(
                Customer.builder().id(customer.getId()).build()
            )
        );
        return customerRepository.save(customer);
    }

    @GetMapping("/customers")
    public List<Customer> orders() {
        return customerRepository.findAll();
    }


    @PostMapping("/feedbacks")
    public List<Feedback> saveFeedback(@RequestBody List<Feedback> feedbacks) {
        return feedbackRepository.saveAll(feedbacks);
    }

    @GetMapping("/feedbacks")
    public List<Feedback> feedback() {
        return feedbackRepository.findAll();
    }


}
