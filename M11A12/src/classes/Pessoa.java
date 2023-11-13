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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
