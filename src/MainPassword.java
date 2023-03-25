import javax.swing.JOptionPane;

import br.com.camyla.password.JPasswordPanel;

public class MainPassword {

	public static void main(String[] args) {

		JPasswordPanel passwordPanel = new JPasswordPanel();
		
		
		int contador = 0;
		final int tentativas = 3;
		boolean verificaSenha = passwordPanel.verificaSenha();

		while (!verificaSenha && contador <= (tentativas-1)) {
			contador++;
			JOptionPane.showMessageDialog(null, "Senha Incorreta, tente novamente.\n Tentativas restantes:" + (tentativas-contador));
			verificaSenha = passwordPanel.verificaSenha();
		}

		System.out.println();
		if (verificaSenha) {
			JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Bloqueado (Senha Incorreta)");
		}

	}

}
