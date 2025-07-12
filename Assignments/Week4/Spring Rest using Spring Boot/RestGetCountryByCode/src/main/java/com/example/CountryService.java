package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")  // ✅ Suppress the unchecked cast warning
    public Country getCountry(String code) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            List<Country> countries = (List<Country>) context.getBean("countryList");

            return countries.stream()
                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElse(null);
        }
    }
}
