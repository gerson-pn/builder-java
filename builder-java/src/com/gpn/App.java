package com.gpn;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		/* Elementos para variar a criação */
		LocalDate data = LocalDate.now();
		Cpf cpf = new Cpf("99999999999", data);

		/* Classe que implmenta o padrão builder */
		ClienteBuilder construtor = new ClienteBuilder();

		Cliente cliente = construtor
				.nome("Tony")
				.sobreNome("Stark")
				.cpf(cpf)
				/* outros atributos se existirem... */
				.build();

		System.out.println(cliente.getNome());
	}
}