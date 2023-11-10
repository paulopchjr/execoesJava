package principal;

import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Veiculos;

public class Inicio {

	public static void main(String[] args) {

		try {

			List<Veiculos>listaVeiculos = null;
			
			String qtd = JOptionPane.showInputDialog("Quantos carros deseja cadastar? ");

			for (int x = 1; x <= Integer.parseInt(qtd); x++) {
				Veiculos veiculos = new Veiculos();
				String nome = JOptionPane.showInputDialog("Qual é o nome do " + x + " veiculo ?");
				veiculos.setNome(nome);

				String marca = JOptionPane.showInputDialog("Qual é a marca do " + x + " veiculo ?");
				veiculos.setMarca(marca);

				String ano = JOptionPane.showInputDialog("Qual é o ano " + x + " veiculo ?");
				veiculos.setAno(Integer.parseInt(ano));

				String modelo = JOptionPane.showInputDialog("Qual é o modelo " + x + " veiculo ?");
				veiculos.setModelo(modelo);

				String cor = JOptionPane.showInputDialog("Qual é a cor" + x + " veiculo ?");
				veiculos.setCor(cor);

				String valor = JOptionPane.showInputDialog("Qual é o valor " + x + " veiculo ? ");
				veiculos.setValor(BigDecimal.valueOf(Double.parseDouble(valor)));

				listaVeiculos.add(veiculos);

			}

			for (Veiculos veiculos : listaVeiculos) {
				System.out.println(veiculos);
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
