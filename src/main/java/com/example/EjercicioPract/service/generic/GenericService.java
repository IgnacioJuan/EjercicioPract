package com.example.EjercicioPract.service.generic;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.ResponseEntity;

public interface GenericService <T, ID extends Serializable> {

    public List<T> findByAll();

    public T save(T entity);

    public T findById(ID id);


    public ResponseEntity<?> delete(ID id);

}