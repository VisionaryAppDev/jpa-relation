package com.example.demo.one_to_one_unidirectional.controller;

import com.example.demo.one_to_one_unidirectional.entity.Country;
import com.example.demo.one_to_one_unidirectional.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OneToOneUnidirectionalController {
    private final CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> countryList() {
        return countryRepository.findAll();
    }

    @PostMapping("/countries")
    public List<Country> saveCountryList(@RequestBody List<Country> countryList) {
        return countryRepository.saveAll(countryList);
    }
}
