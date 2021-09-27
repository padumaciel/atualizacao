package com.accenture.academico.bank.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//para informar que a classe irá responder como REST
@RestController

//Define que o controler path será padrão 
@RequestMapping("/bank")
public class BankController {
	/*
	 -Aqui iremos listar todos os clientes, mas pq dto? data transfer object(dto) ele irá facilitar a 
	 transferência dos dados clientes, para cá :)
	 - O FindAll() irá retornar as entidades em forma de lista
	 */
	public List<ClientDTO>findAll(){
		return null;//to vendo como faz
		
	}
	

}
