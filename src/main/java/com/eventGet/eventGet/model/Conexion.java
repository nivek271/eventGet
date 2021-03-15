package com.eventGet.eventGet.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Conexion {
	@Autowired
	@Qualifier("beanUsuario")
	private Usuario usuaruio;
	
	private String db;
	private String url;
	
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
