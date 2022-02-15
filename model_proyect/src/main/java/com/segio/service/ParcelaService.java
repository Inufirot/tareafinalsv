package com.segio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.segio.Parcela;
import com.segio.repositorios.ParcelaRepository;

@Service
@Transactional
public class ParcelaService {
	
	
	@Autowired
    private ParcelaRepository repo;
     
  public List<Parcela> listAll() {
        return repo.findAll();
    }
     
    public void save(Parcela par) {
        repo.save(par);
    }
     
    public Parcela get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
