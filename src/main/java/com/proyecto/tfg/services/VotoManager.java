package com.proyecto.tfg.services;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyecto.tfg.entities.Funcionalidad;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.entities.Voto;
import com.proyecto.tfg.repositories.FuncionalidadesRepository;
import com.proyecto.tfg.repositories.UsuarioRepository;
import com.proyecto.tfg.repositories.VotoRepository;
import org.apache.log4j.Logger;


//import com.proyecto.tfg.web.controllers.ListaVotos;

public class VotoManager {
	
	private final Logger logger = Logger.getLogger(this.getClass());
	@Autowired

	private VotoRepository votoRepository;
	
	@Autowired
	FuncionalidadManager funcionalidadManager;

	@Autowired
	private Usuario usuario;
	@Autowired
	private Funcionalidad funcionalidad;
	
	@Autowired
	private UsuarioRepository usuariosRepository;

	

	
	public Iterable<Voto> obtenerVotos() {
		 logger.debug(" Método para obtener votos");
		
		return votoRepository.findAll();
	}

	
	 public void realizarVotación(Funcionalidad funcionalidad, Usuario usuario) throws IllegalArgumentException{ 
		 // 1.crear voto
		 logger.debug(" Método para realizar la votación");
		 
		 Voto voto = new Voto();
		 voto.setFuncionalidad(funcionalidad);
		 voto.setUsuario(usuario); 
		 //2.Mantener los votos usuario(restar)
		 
		 
		 restarVotoUsuario(usuario); //preguntar
		 
		 
//	       // for (Funcionalidad f:listaFun) {
//	            
//	        	
//	        
	    }
	 	public void restarVotoUsuario(Usuario usuario) {
	 		
	 		logger.debug(" Método para restar votoUsuario   ");
	 		Integer v= usuario.getVotos_restantes();
	 
	 		usuario.setVotos_restantes(v-1) ;
	 		
	 		usuariosRepository.save(usuario);
	 		
	 	}
	    //return funcionalidadManager.obtenerFuncionalidades();
}
 