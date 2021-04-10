package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.almacenModel;
import com.example.demo.services.AlmacenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/empresa")
public class AlmacenController {
    @Autowired
    private AlmacenService almacenservice;

    @GetMapping()
    public ArrayList<almacenModel> obtenerAlmacen(){
        return almacenservice.obteneralmacen();
    }

    @PostMapping()
    public almacenModel guardarAlmacen(@RequestBody almacenModel almacen){
        return this.almacenservice.guardarAlmacen(almacen);
    }

    @GetMapping(path = "/{id}")
    public Optional<almacenModel>obteneralmacenporid(@PathVariable("id") Integer id) {
        return this.almacenservice.obtenerPorId(id);
    }

    @GetMapping("/query")
    public Optional<almacenModel> obtenerusuarioporprioridad(@RequestParam("prioridad") Integer prioridad){
        return this.almacenservice.obtenerPorId(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer id){
        boolean ok= this.almacenservice.eliminaralmacen(id);
        if(ok){
            return "Se elimino la emrpesa con ID"+ id;
        }else{
            return "No se pudo eliminar la empresa con ID "+ id;
        }
    }
    


    
}
