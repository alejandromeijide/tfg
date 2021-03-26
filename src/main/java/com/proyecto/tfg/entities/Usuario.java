package com.proyecto.tfg.entities;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(generator = "serial")
	@SequenceGenerator(name = "serial", sequenceName = "serial", allocationSize = 1)
	private Integer id;
	private String nombre;
	private String password;
	private String email;
	private String empresa;
	private Integer id_rol;
	private Integer votos_asignados;
	private String idioma;
	private Boolean condicion;
	private Integer empresa_id;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String password, String email, String empresa, Integer id_rol,
			Integer votos_asignados, String idioma) {
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.empresa = empresa;
		this.id_rol = id_rol;
		this.votos_asignados = votos_asignados;
		this.idioma = idioma;

	}

	public void setId_usuario(Integer id_usuario) {
		this.id = id_usuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setId_rol(Integer id_rol) {
		this.id_rol = id_rol;
	}

	public void setVotos_asignados(Integer votos_asignados) {
		this.votos_asignados = votos_asignados;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setCondicion(Boolean condicion) {
		this.condicion = condicion;
	}

	public void setEmpresa_id(Integer empresa_id) {
		this.empresa_id = empresa_id;
	}

	public Integer getId_usuario() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getId_rol() {
		return id_rol;
	}

	public Integer getVotos_asignados() {
		return votos_asignados;
	}

	public String getIdioma() {
		return idioma;
	}

	public Boolean getCondicion() {
		return condicion;
	}

	public Integer getEmpresa_id() {
		return empresa_id;
	}

}
