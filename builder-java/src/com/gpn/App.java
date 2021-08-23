package com.gpn;

import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		Cpf cpf = new Cpf("99999999999", LocalDate.now());

		Cliente cliente = Cliente.builder()
				.nome("Tony")
				.sobreNome("Stark")
				.cpf(cpf)
				.build();
		
		System.out.println(cliente.getNome());

	}
}