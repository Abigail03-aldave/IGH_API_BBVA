package com.example.demo.repositories;



import com.example.demo.models.almacenModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmacenRepository extends JpaRepository<almacenModel, Integer> {

 
    
}
