package com.segio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plantas")

public class Planta {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	private String nombre;
	
	
	public Planta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planta(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
