package com.gpn;


public class Cliente {
	private String nome;
	private String sobreNome;
	private String nomeSocial;
	private Cpf cpf;
	private Telefone telefone;
	private Endereco endereco;

	private Cliente(ClienteBuilder construtor) {
		this.nome = construtor.nome;
		this.sobreNome = construtor.sobreNome;
		this.nomeSocial = construtor.nomeSocial;
		this.cpf = construtor.cpf;
		this.telefone = construtor.telefone;
		this.endereco = construtor.endereco;
	}
	
	public static ClienteBuilder builder() {
		return new ClienteBuilder();
	}

	public static class ClienteBuilder {
		private String nome;
		private String sobreNome;
		private String nomeSocial;
		private Cpf cpf;
		private Telefone telefone;
		private Endereco endereco;
		
		public Cliente build() {
            Cliente cliente =  new Cliente(this);
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