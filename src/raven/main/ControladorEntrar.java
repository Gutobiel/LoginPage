package raven.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ControladorEntrar implements ActionListener {
	private JTextField txtLogin = null;
	private JTextField txtPassword = null;
	public ControladorEntrar(JTextField txtLogin, JTextField txtPassword) {
		super();
		this.txtLogin = txtLogin;
		this.txtPassword = txtPassword;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cr�ticas de dados
		if(txtLogin.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo login vazio!!", "00000", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(txtPassword.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo password vazio!!", "00000", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
		
	}
}
