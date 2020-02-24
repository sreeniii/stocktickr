package com.sreeni.stocktickr.controllers;

import com.sreeni.stocktickr.models.Cities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CapitalsController {

    @GetMapping("/api/capitals/{cityName}")
    public Cities getCapitalsCities(@PathVariable String cityName){

        Cities cities = new Cities();
        cities.setCityName("Hyderabad");
        cities.setStateName("telangana");

        return cities;
    }

     @GetMapping("/api/capitals/")
    public List<Cities> getCapitalsList(){
        List<Cities> citiesList = new ArrayList<>();
        Cities cities4 = new Cities();
        cities4.setCityName("abd");
        cities4.setStateName("wer");

        Cities cities5 = new Cities();
        cities5.setCityName("abs");
        cities5.setStateName("dfg");

        citiesList.add(cities4);
        citiesList.add(cities5);

        return citiesList;

     }

}
