package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Pessoa;

public class Inicio {

	public static void main(String[] args) {

		try {

			String qtd = JOptionPane.showInputDialog("Quantas pessoas desejam adicionar na lista?");
			if (!qtd.isEmpty() && qtd != null) {
				List<Pessoa> pessoas = null;

				for (int posicao = 0; posicao <= Integer.parseInt(qtd); posicao++) {
					Pessoa pessoa = new Pessoa();
					String nomePessoa = JOptionPane.showInputDialog("Qual é o nome da primeira pessoa ?");
					pessoa.setNome(nomePessoa);
					String idadePessoa = JOptionPane.showInputDialog("Qual é a sua idade ?");
					pessoa.setIdade(Integer.parseInt(idadePessoa));

					pessoas.add(pessoa); // adicionando a pessoa na lista

				}

				for (Pessoa pessoa : pessoas) {
					System.out.println("Nome: " + pessoa.getNome() + "\n Idade: " + pessoa.getIdade());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Informe a quantidade de pessoa");
			}

		} catch (Exception e) {
			StringBuilder saida = new StringBuilder();
			e.printStackTrace();

			// e.getStackTrace() retorna um array de erros;
			for (int posErro = 0; posErro < e.getStackTrace().length; posErro++) {
				saida.append(" \n Classe do erro: " + e.getStackTrace()[posErro].getClassName());
				saida.append(" \n Método do erro: " + e.getStackTrace()[posErro].getMethodName());
				saida.append(" \n Linha do erro: " + e.getStackTrace()[posErro].getLineNumber());
				saida.append(" \n Arquivo do erro: " + e.getStackTrace()[posErro].getFileName());
			}

			JOptionPane.showMessageDialog(null, "Erro: " + saida.toString());
		}
	}

}
