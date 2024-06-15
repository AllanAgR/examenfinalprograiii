package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TareaModel;
import com.example.demo.services.TareaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Tarea")
public class TareaController {
    @Autowired
    TareaService tareaService;

    @GetMapping()
    public ArrayList<TareaModel> obtenerTarea(){
        return tareaService.obtenerTarea();
    }

    @PostMapping()
    public TareaModel guardarTarea(@RequestBody TareaModel Tarea){
        return this.tareaService.guardarTarea(Tarea);
    }

    @GetMapping( path = "/{id}")
    public Optional<TareaModel> obtenerTareaPorId(@PathVariable("id") Long id) {
        return this.tareaService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.tareaService.eliminarTarea(id);
        if (ok){
            return "Se eliminó la tarea " + id;
        }else{
            return "No pudo eliminar la tarea" + id;
        }
    }

}