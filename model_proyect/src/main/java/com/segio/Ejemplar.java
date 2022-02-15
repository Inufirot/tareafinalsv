package com.segio;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="ejemplares")
public class Ejemplar {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	private int edad;
	@Column(name = "fechacompra")
	private java.sql.Date fechaCompra;
	@Column(name = "fechaplantacion")
	private java.sql.Date fechaPlantacion;
	
	
	public Ejemplar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ejemplar(long id, int edad, Date fechaCompra, Date fechaPlantacion) {
		super();
		this.id = id;
		this.edad = edad;
		this.fechaCompra = fechaCompra;
		this.fechaPlantacion = fechaPlantacion;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public java.sql.Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(java.sql.Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public java.sql.Date getFechaPlantacion() {
		return fechaPlantacion;
	}
	public void setFechaPlantacion(java.sql.Date fechaPlantacion) {
		this.fechaPlantacion = fechaPlantacion;
	}

	
	
	
}
