package com.accenture.academico.bank.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Agency {
	@Id @GeneratedValue
	private int id;
	@Column (nullable = false)
	private String nomeAgencia;
	@Column (nullable = false)
	private String endereco;
	@Column (nullable = false)
	private String telefone;
	//private int idCliente;

}
