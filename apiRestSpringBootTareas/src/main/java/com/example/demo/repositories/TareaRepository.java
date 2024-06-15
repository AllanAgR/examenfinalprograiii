package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.TareaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<TareaModel, Long> {
    public abstract ArrayList<TareaModel> findByPrioridad(Integer prioridad);

}