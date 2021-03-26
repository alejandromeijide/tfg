package com.proyecto.tfg.web.controllers;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyect.tfg.command.UsuarioCommand;
import com.proyecto.tfg.entities.Usuario;
import com.proyecto.tfg.services.UsuarioManager;

public class UsuarioController {
protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 
	UsuarioManager usuariosManager;

	@RequestMapping(value = "/usuarios")
	public ModelAndView handleRequest(Model model, @PathVariable Usuario usuarios) {
		
		
		UsuarioCommand usuariosCommand = null;//usuariosManager.usuriosToClientCommand(usuarios);
		List<Usuario> obtenerProductos = null;//usuarios.getProducts();
		
		model.addAttribute("listaProductos", obtenerProductos);
		model.addAttribute("clientCommand", usuariosCommand);
		return new ModelAndView("/WEB-INF/views/mostrarproductos.jsp");
	}
}



