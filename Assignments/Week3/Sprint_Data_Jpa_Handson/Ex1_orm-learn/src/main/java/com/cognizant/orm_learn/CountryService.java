package com.cognizant.orm_learn;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @jakarta.transaction.Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
