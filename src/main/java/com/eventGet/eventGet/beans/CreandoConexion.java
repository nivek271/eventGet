package com.eventGet.eventGet.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.eventGet.eventGet.model.Conexion;
import com.eventGet.eventGet.model.Usuario;


@Component
public class CreandoConexion {
	
	@Bean (name = "beanUsuario")
	public Usuario getUsuario() {
		return new Usuario();
		
	}
	
	@Bean (name = "beanConexion" )
	public Conexion getConexion() {
		Conexion conexion = new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		return conexion;
	}	
	
	@Bean (name = "beanConexionDos" )
	public Conexion getConexionDos() {
		Conexion conexion = new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		return conexion;
	}	
}
