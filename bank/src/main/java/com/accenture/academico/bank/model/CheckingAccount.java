package com.accenture.academico.bank.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CheckingAccount {
	@Id @GeneratedValue
	private int idContaConrrente;
	@Column (nullable = false)
	private String contaCorrenteAgencia;
	@Column (nullable = false)
	private String contaCorrenteNum;
	@Column (nullable = false)
	private float contaCorrenteSaldo;
	//private int idcliente

}
