package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.almacenModel;
import com.example.demo.repositories.AlmacenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {

    @Autowired
    private AlmacenRepository Almacenrepository;

    public ArrayList<almacenModel> obteneralmacen(){
        return (ArrayList<almacenModel>) Almacenrepository.findAll();
    }

    public almacenModel guardarAlmacen(almacenModel almacen){

        return Almacenrepository.save(almacen);

    }

    public Optional<almacenModel> obtenerPorId(Integer id){
        return Almacenrepository.findById(id);
     }
/*
     public ArrayList<almacenModel> obtenerPorPrioridad(Integer prioridad){
        return Almacenrepository.findByPrioridad(prioridad);
    }
*/
    public boolean eliminaralmacen(Integer id ){

        try {
            Almacenrepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    


}
