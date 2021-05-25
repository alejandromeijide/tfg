package com.proyecto.tfg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.proyect.tfg.command.FuncionalidadCommand;
import com.proyecto.tfg.entities.Funcionalidad;
import com.proyecto.tfg.repositories.FuncionalidadesRepository;

import org.apache.log4j.Logger;
import java.text.MessageFormat;
@Service
public class FuncionalidadManager {
	
	 private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private FuncionalidadesRepository funcionalidadesRepository;

	public boolean deleteFuncionalidad(@PathVariable Funcionalidad funcionalidad) {
		 logger.debug("Método borrar funcionalidad");
		try {
			funcionalidadesRepository.delete(funcionalidad);
		} catch (Exception e) {
			logger.error (e.getMessage (), e);
			e.printStackTrace();
			return false;
		}
		return true;
	}
 
	public Funcionalidad patchFuncionalidad(@PathVariable FuncionalidadCommand funcionalidadesCommand) {
		logger.debug("Método patchfuncionalidad");
		Funcionalidad funcionalidad = null;

		// Creacion
		funcionalidad = new Funcionalidad();
		
		funcionalidad.setEstado(null);
		/** TODO: Transformar command a Funcionalidad */
		funcionalidadesRepository.save(funcionalidad);
		return funcionalidad;
	}
	
	public Funcionalidad putFuncionalidad(@PathVariable FuncionalidadCommand funcionalidadesCommand) {
		logger.debug("Método putfuncionalidad");
		Funcionalidad funcionalidad = null;
		// Creacion
		funcionalidad = new Funcionalidad();
		
		funcionalidad.setEstado(null);
		/** TODO: Transformar command a Funcionalidad */
		funcionalidadesRepository.save(funcionalidad);
		return funcionalidad;
	}
	
	
	public Iterable<Funcionalidad> obtenerFuncionalidades() {
		logger.debug("Método obtener lista funcionalidades");
		return funcionalidadesRepository.findAll();
	}

}
