package com.testeSpring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testeSpring.demo.model.Evento;
import com.testeSpring.demo.repository.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	
	@RequestMapping(value="/cadastrarEvento" ,method = RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}
	@RequestMapping(value="/cadastrarEvento" ,method = RequestMethod.POST)
	public String form(Evento evento) {
		
		eventoRepository.save(evento);
		return "redirect:/cadastrarEvento";
	}
}