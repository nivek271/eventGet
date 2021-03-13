package com.eventGet.eventGet.model;

import java.util.Date;

public class Post {
	private int id;
	private String descrip;
	private String urlImg = "http://localhost:8181/img/eventGet.png";
	private Date fecha = new Date();
	private String titulo;
	
	
	
	 
	
	
	public Post(int id, String descrip, String urlImg, Date fecha, String titulo) {
		
		this.id = id;
		this.descrip = descrip;
		this.urlImg = urlImg;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	
	public Post() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
