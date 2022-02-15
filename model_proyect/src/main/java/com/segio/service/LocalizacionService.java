package com.segio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.segio.Localizacion;
import com.segio.repositorios.LocalizacionRepository;

@Service
@Transactional
public class LocalizacionService {
	
	 @Autowired
	    private LocalizacionRepository repo;
	     
	  public List<Localizacion> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Localizacion loc) {
	        repo.save(loc);
	    }
	     
	    public Localizacion get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
