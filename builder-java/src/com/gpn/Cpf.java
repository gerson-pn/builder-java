package com.gpn;

import java.time.LocalDate;

public class Cpf {
	private String numero;
	private LocalDate dataEmissao;

	public Cpf(String numero, LocalDate dataEmissao) {
		this.numero = numero;
		this.dataEmissao = dataEmissao;
	}

	public String getNumero() {
		return numero;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
}