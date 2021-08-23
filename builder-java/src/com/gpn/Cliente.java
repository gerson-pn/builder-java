package com.gpn;

public class Cliente {
	private String nome;
	private String sobreNome;
	private String nomeSocial;
	private Cpf cpf;
	private Telefone telefone;
	private Endereco endereco;

	public Cliente(String nome, String sobreNome, String nomeSocial, Cpf cpf, Telefone telefone, Endereco endereco) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public Cpf getCpf() {
		return cpf;
	}
}