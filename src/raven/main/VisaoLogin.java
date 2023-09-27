package raven.main;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VisaoLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JTextField txtPassword;
	public static void main(String[] args) {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            System.err.println(ex);
	        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisaoLogin window = new VisaoLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VisaoLogin() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 727);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(96, 126, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(96, 141, 170, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(96, 172, 69, 14);
		frame.getContentPane().add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(96, 187, 170, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(96, 218, 170, 20);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ControladorEntrar(txtLogin, txtPassword));
		
		final JLabel lblNewLabel_1 = new JLabel("Forgot password");
		lblNewLabel_1.setBounds(138, 249, 126, 14);
		frame.getContentPane().add(lblNewLabel_1);	
		lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		Label label = new Label("__________ ou _______________");
		label.setBounds(96, 269, 170, 22);
		frame.getContentPane().add(label);
		
		JButton btnCriarNovaConta = new JButton("Criar nova conta");
		btnCriarNovaConta.setBounds(117, 297, 134, 33);
		frame.getContentPane().add(btnCriarNovaConta);
		
		JButton btnSair = new JButton("Exit");
		btnSair.setBounds(277, 11, 57, 23);
		frame.getContentPane().add(btnSair);
		btnSair.addActionListener(new ControladorSair());
		}
}