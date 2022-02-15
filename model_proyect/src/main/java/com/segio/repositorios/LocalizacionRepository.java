package com.segio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.segio.Localizacion;
	


	public interface LocalizacionRepository extends JpaRepository<Localizacion, Long>{
		
}
