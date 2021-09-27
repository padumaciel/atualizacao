package com.accenture.academico.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//dizemos ao Spring boot que essa é uma entidade
@Entity
//informamos que é uma tabela e qual o nome dela
@Table (name = "cliente")
public class Client {
	//informamos que é uma id
	@Id 
	//vai gerar um valor automaticamente
	@GeneratedValue  (strategy = GenerationType.IDENTITY)
	//informamos o nome que a coluna com essa informação irá receber
	@Column (name = "cdPessoa")
	private int idCliente;
	
	// o nullable = false é para obrigar o preenchimento
	@Column (nullable = false, name ="name")
	private String nome;
	
	//aqui iremos usar io validation, para saber se o cpf é valido ou não.  criar uma exceção :)
	@Column (nullable = false, name = "cpf")
	private String cpf;
	
	@Column (nullable = false, name = "telefone")
	private String telefone;
	
	
	//depois criamos os getters e setters, mas acho que iremos tirar depois, pq iremos usar o lombok
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
