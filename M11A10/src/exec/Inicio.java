package exec;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Pessoa;

public class Inicio {
	public static void main(String[] args) {

		try {

			File file = new File("lines.txt");
			Scanner scanner = new Scanner(file);
			
			
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			String qtd = JOptionPane.showInputDialog("Quantas pessoas desejam cadastrar na lista? ");
			for (int qtdP = 0; qtdP < Integer.valueOf(qtd); qtdP++) {

				String nomePessoa = JOptionPane.showInputDialog("Qual é o nome da pessoa " + qtdP + " ? ");
				String idadePessoa = JOptionPane.showInputDialog("Qual é a sua idade ? ");
				String salaPessoa = JOptionPane.showInputDialog("Qual é o seu salário ? ");

				Pessoa pessoa = new Pessoa(nomePessoa, Integer.valueOf(idadePessoa),
						BigDecimal.valueOf(Double.valueOf(salaPessoa)));

				listaPessoas.add(pessoa);

			}

			for (Pessoa pessoa : listaPessoas) {
				StringBuilder saidaPessoa = new StringBuilder();
				saidaPessoa.append(" \n Nome" + pessoa.getNome());
				saidaPessoa.append(" \n Idade" + pessoa.getIdade());
				saidaPessoa.append(" \n Salário" + pessoa.getSalario());

				JOptionPane.showMessageDialog(null, "Pessoa: " + saidaPessoa.toString());
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			StringBuilder saida = new StringBuilder();

			// e.getStackTrace() retorna um array de erros;
			for (int posErro = 0; posErro < e.getStackTrace().length; posErro++) {
				saida.append(" \n Classe do erro: " + e.getStackTrace()[posErro].getClassName());
				saida.append(" \n Método do erro: " + e.getStackTrace()[posErro].getMethodName());
				saida.append(" \n Linha do erro: " + e.getStackTrace()[posErro].getLineNumber());
				saida.append(" \n Arquivo do erro: " + e.getStackTrace()[posErro].getFileName());
			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de número: " + saida.toString());

		}
		
		catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "NullPointer Execption: alguma coisa está em null " + e.getClass());	// TODO: handle exception
			
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
			JOptionPane.showInternalMessageDialog(null, "FileNotFoundException: Arquivo não existe " + e.getMessage());
		}
	}

}
