package com.testeSpring.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.testeSpring.demo.model.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	
	

}
