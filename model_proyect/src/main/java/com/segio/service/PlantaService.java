package com.segio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.segio.Planta;
import com.segio.repositorios.PlantaRepository;

@Service
@Transactional
public class PlantaService {
	
	
	@Autowired
    private PlantaRepository repo;
     
  public List<Planta> listAll() {
        return repo.findAll();
    }
     
    public void save(Planta pla) {
        repo.save(pla);
    }
     
    public Planta get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }


}
