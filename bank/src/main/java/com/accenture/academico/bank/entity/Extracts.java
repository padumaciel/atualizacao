package com.accenture.academico.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "extrato")
public class Extracts {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "idExtrato")
	private int idExtrato;
	
	//observar depois loaldatetime
	@Column (name = "dataHora") 
	private LocalDateTime dateHoraMovimento;
	
	@Column (nullable = false, name = "operação")
	private String operacao;
	
	@Column (name = "valorOperação")
	private float valorOperacao;
	
	//private int idContaCorrente

}
