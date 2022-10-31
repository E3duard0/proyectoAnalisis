package com.example.pasteleria.repo;

import com.example.pasteleria.model.Pastel;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableEurekaClient
public interface PastelRepository extends JpaRepository<Pastel, Integer>{
}
