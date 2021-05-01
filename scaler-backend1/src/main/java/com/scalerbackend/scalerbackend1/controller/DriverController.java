package com.scalerbackend.scalerbackend1.controller;

import com.scalerbackend.scalerbackend1.model.Driver;
import com.scalerbackend.scalerbackend1.repository.DriverRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class DriverController {


        @Autowired

        private DriverRespository driverRespository;

        //got stuck in this because name and phone number added is null
        @PostMapping("/drivers/new")
        public Driver createDriver(@RequestBody Driver driver)
        {
            return driverRespository.save(driver);
        }

    @GetMapping("/drivers")
    public List<Driver> getAllDrivers(){
        return driverRespository.findAll();
    }

    }


