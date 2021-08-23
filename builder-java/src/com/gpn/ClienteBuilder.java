package com.gpn;

public final class ClienteBuilder {
	private String nome;
	private String sobreNome;
	private String nomeSocial;
	private Cpf cpf;
	private Telefone telefone;
	private Endereco endereco;
	public Cliente build() {
		Cliente cliente = new Cliente(
		this.nome, 
		this.sobreNome, this.nomeSocial, this.cpf, this.telefone,
		this.endereco);
		return cliente;
	}
	public ClienteBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}
	public ClienteBuilder sobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
		return this;
	}
	public ClienteBuilder nomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
		return this;
	}
	public ClienteBuilder cpf(Cpf cpf) {
		this.cpf = cpf;
		return this;
	}
	public ClienteBuilder telefone(Telefone telefone) {
		this.telefone = telefone;
		return this;
	}
	public ClienteBuilder endereco(Endereco endereco) {
		this.endereco = endereco;
		return this;
	}
}

