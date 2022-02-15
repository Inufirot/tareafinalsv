package com.segio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.segio.Ejemplar;
import com.segio.repositorios.EjemplarRepository;
 
@Service
@Transactional
public class EjemplarService {
 
    @Autowired
    private EjemplarRepository repo;
     
  public List<Ejemplar> listAll() {
        return repo.findAll();
    }
     
    public void save(Ejemplar eje) {
        repo.save(eje);
    }
     
    public Ejemplar get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
   
}