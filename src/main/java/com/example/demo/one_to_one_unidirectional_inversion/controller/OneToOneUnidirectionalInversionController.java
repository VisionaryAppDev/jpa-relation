package com.example.demo.one_to_one_unidirectional_inversion.controller;

import com.example.demo.one_to_one_unidirectional_inversion.entity.Citizen;
import com.example.demo.one_to_one_unidirectional_inversion.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OneToOneUnidirectionalInversionController {
    private final CitizenRepository citizenRepository;

    @GetMapping("/citizens")
    public List<Citizen> countryList() {
        return citizenRepository.findAll();
    }

    @PostMapping("/citizens")
    public List<Citizen> saveCountryList(@RequestBody List<Citizen> countryList) {
        return citizenRepository.saveAll(countryList);
    }
}
