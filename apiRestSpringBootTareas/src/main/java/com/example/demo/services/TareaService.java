package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.TareaModel;
import com.example.demo.repositories.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    @Autowired
    TareaRepository tareaRepository;
    
    public ArrayList<TareaModel> obtenerTarea(){
        return (ArrayList<TareaModel>) tareaRepository.findAll();
    }

    public TareaModel guardarTarea(TareaModel Tarea){
        return tareaRepository.save(Tarea);
    }

    public Optional<TareaModel> obtenerPorId(Long id){
        return tareaRepository.findById(id);
    }


    public boolean eliminarTarea(Long id) {
        try{
            tareaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}