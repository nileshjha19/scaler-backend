package com.scalerbackend.scalerbackend1.controller;

import com.scalerbackend.scalerbackend1.model.Ride;
import com.scalerbackend.scalerbackend1.repository.RideRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class RideController {

    @Autowired
    private RideRespository rideRespository;

    @PostMapping("/ride/new")
    public Ride createDriver(@RequestBody Ride ride)
    {
        return rideRespository.save(ride);
    }




}
