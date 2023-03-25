package br.com.camyla.password;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class JPasswordPanel {

	public static final String SENHA = "SENHA123";
	
	public boolean verificaSenha() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Digite a senha: ");
		JPasswordField pass = new JPasswordField(15);
		panel.add(label);
		panel.add(pass);
		String[] options = {"OK","Cancelar"};
		int option = JOptionPane.showOptionDialog(null, panel, "Digite a Senha", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
		if(option==1) {
			String senha = String.copyValueOf(pass.getPassword());
			if(senha.equals(SENHA)) {
				return true;
			}
		}
		return false;
	}
}
