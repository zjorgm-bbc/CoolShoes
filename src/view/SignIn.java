package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignIn {

	private JFrame frmAnmelden;
	private JTextField textField;
	private JTextField textField_1;

	
	/**
	 * Create the application.
	 */
	public SignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnmelden = new JFrame();
		frmAnmelden.setTitle("Anmelden");
		frmAnmelden.setBounds(100, 100, 400, 129);
		frmAnmelden.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnmelden.getContentPane().setLayout(null);
		
		JButton btnAnmelden = new JButton("Anmelden");
		btnAnmelden.setBounds(279, 67, 91, 23);
		frmAnmelden.getContentPane().add(btnAnmelden);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(10, 36, 163, 20);
		frmAnmelden.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email/Admin");
		lblEmail.setBounds(10, 11, 163, 14);
		frmAnmelden.getContentPane().add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 36, 163, 20);
		frmAnmelden.getContentPane().add(textField_1);
		
		JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setBounds(207, 11, 241, 14);
		frmAnmelden.getContentPane().add(lblPasswort);
		
		JLabel lblNochKeinKonto = new JLabel("Noch kein Konto? Jetzt registrieren!");
		lblNochKeinKonto.setBounds(10, 71, 228, 14);
		lblNochKeinKonto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new SignUp();
			}
		});
		frmAnmelden.getContentPane().add(lblNochKeinKonto);
		this.frmAnmelden.setVisible(true);
		
		btnAnmelden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField_1.getText().equals("1234") && textField.getText().equals("admin")){
					new Bestellungen();
				} else{
					System.out.println("Wrong userdata");
				}
			}
		});;
	}
}
