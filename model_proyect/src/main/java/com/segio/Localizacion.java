package com.segio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localizaciones")
public class Localizacion {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	private char longitud;  
	private char latitud;
	@Column(name = "gradoslongitud")
	private double gradosLongitud;
	@Column(name = "gradoslatitud")
	private double gradosLatitud;
	
	
	public Localizacion() {
		super();
		
	}


	public Localizacion(long id, char longitud, char latitud, double gradosLongitud, double gradosLatitud) {
		super();
		this.id = id;
		this.longitud = longitud;
		this.latitud = latitud;
		this.gradosLongitud = gradosLongitud;
		this.gradosLatitud = gradosLatitud;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public char getLongitud() {
		return longitud;
	}


	public void setLongitud(char longitud) {
		this.longitud = longitud;
	}


	public char getLatitud() {
		return latitud;
	}


	public void setLatitud(char latitud) {
		this.latitud = latitud;
	}


	public double getGradosLongitud() {
		return gradosLongitud;
	}


	public void setGradosLongitud(double gradosLongitud) {
		this.gradosLongitud = gradosLongitud;
	}


	public double getGradosLatitud() {
		return gradosLatitud;
	}


	public void setGradosLatitud(double gradosLatitud) {
		this.gradosLatitud = gradosLatitud;
	}
	
	

}
