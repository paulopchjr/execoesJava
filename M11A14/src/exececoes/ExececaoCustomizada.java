package exececoes;

import javax.swing.JOptionPane;

public class ExececaoCustomizada extends Exception {

	private static final long serialVersionUID = 1L;

	
	/*Ao instanciar sempre precisa passar a mensagem de erro, passa a mensagem para o a classe pai*/
	public ExececaoCustomizada(String erro) {
		super("Arquivo não existe " + erro);
	}

}
