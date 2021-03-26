package com.proyecto.tfg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Voto {

	@Id
	@GeneratedValue(generator = "serial")
	@SequenceGenerator(name = "serial", sequenceName = "serial", allocationSize = 1)
	private Integer id;
//	private Usuario usuario;
//	private Funcionalidad funcionalidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Usuario getUsuario() {
//		return usuario;
//	}
//
//	public void setUsuario(Usuario usuario) {
//		this.usuario = usuario;
//	}
//
//	public Funcionalidad getFuncionalidad() {
//		return funcionalidad;
//	}
//
//	public void setFuncionalidad(Funcionalidad funcionalidad) {
//		this.funcionalidad = funcionalidad;
//	}

	public Voto() {
		super();
	}

}
