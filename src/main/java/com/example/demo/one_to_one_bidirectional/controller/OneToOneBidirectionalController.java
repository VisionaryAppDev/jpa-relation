package com.example.demo.one_to_one_bidirectional.controller;

import com.example.demo.one_to_one_bidirectional.entity.Address;
import com.example.demo.one_to_one_bidirectional.entity.Employee;
import com.example.demo.one_to_one_bidirectional.repository.AddressRepository;
import com.example.demo.one_to_one_bidirectional.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class OneToOneBidirectionalController {
    private final EmployeeRepository employeeRepository;
    private final AddressRepository addressRepository;

    @GetMapping("/employees")
    public List<Employee> countryList() {
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee saveCountryList() {
        UUID uuid = UUID.randomUUID();
        Employee employee = new Employee(uuid, "Test: ", new Address(UUID.randomUUID(), "Location: ", new Employee(uuid)));
        return employeeRepository.save(employee);
    }

    @GetMapping("/addresses")
    public List<Address> addressList() {
        return addressRepository.findAll();
    }
}
