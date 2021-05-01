package com.scalerbackend.scalerbackend1.repository;


import com.scalerbackend.scalerbackend1.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRespository extends JpaRepository <Driver, Long> {



}
