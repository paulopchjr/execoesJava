package classes;

import java.math.BigDecimal;

public class Pessoa {

	private String nome;
	private int idade;
	private BigDecimal salario;

	public Pessoa(String nPadrao, int iPadrao, BigDecimal sPadrao) {

		this.nome = nPadrao;
		this.idade = iPadrao;
		this.salario = sPadrao;

	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

}
