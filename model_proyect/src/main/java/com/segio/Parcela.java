package com.segio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="parcelas")
public class Parcela {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private double area;
	private boolean privada;
	
	public Parcela(long id, String nombre, double area, boolean privada) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.area = area;
		this.privada = privada;
	}

	public Parcela() {
		super();
		// TODO Auto-generated constructor stub
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isPrivada() {
		return privada;
	}

	public void setPrivada(boolean privada) {
		this.privada = privada;
	}
	
	
	
}
