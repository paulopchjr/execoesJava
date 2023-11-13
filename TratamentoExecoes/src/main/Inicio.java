package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Erros.Execeoes;
import classes.Pessoa;

public class Inicio {

	public static void main(String[] args) throws Execeoes {

		try {
			
			//lerArquivo();
			
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			String qtd = JOptionPane.showInputDialog("Quantas pessoas deseja armazenar na lista?");

			for (int p = 0; p < Integer.valueOf(qtd); p++) {

				String nome = JOptionPane.showInputDialog("Informe o nome da pessoa " + p);
				String idade = JOptionPane.showInputDialog("Qual é a sua idade?");
				String salario = JOptionPane.showInputDialog("Qual é o seu salário?");
				Pessoa pessoa = new Pessoa(nome, Integer.valueOf(idade), BigDecimal.valueOf(Double.valueOf(salario)));
				
				listaPessoas.add(pessoa);

			}
			
			for (Pessoa pessoa : listaPessoas) {
				JOptionPane.showMessageDialog(null, "Nome:" + pessoa.getNome());
				JOptionPane.showMessageDialog(null, "Idade:" + pessoa.getIdade());
				JOptionPane.showMessageDialog(null, "Salário:" + pessoa.getSalario());
			}

		} catch (Exception e) {

			e.printStackTrace();
			throw new Execeoes(e.getMessage());
		}

	}
	
	
	
	public static void lerArquivo() throws Execeoes, FileNotFoundException {
		
		File file = new File("aaa.txt");
		Scanner scanner = new Scanner(file);
		
	}

}
