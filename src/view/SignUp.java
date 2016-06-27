package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SignUp {

	private JFrame frmRegistrieren;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrieren = new JFrame();
		frmRegistrieren.setTitle("Registrieren");
		frmRegistrieren.setBounds(100, 100, 388, 291);
		frmRegistrieren.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrieren.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(211, 14, 159, 20);
		frmRegistrieren.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(23, 14, 178, 14);
		frmRegistrieren.getContentPane().add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(23, 39, 178, 14);
		frmRegistrieren.getContentPane().add(lblNachname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 39, 159, 20);
		frmRegistrieren.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStrasseNr = new JLabel("Strasse, Nr");
		lblStrasseNr.setBounds(23, 64, 178, 14);
		frmRegistrieren.getContentPane().add(lblStrasseNr);
		
		JLabel lblNewLabel = new JLabel("Ort");
		lblNewLabel.setBounds(23, 89, 178, 14);
		frmRegistrieren.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLZ");
		lblNewLabel_1.setBounds(23, 114, 178, 14);
		frmRegistrieren.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(23, 139, 178, 14);
		frmRegistrieren.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Passwort");
		lblNewLabel_3.setBounds(23, 164, 178, 14);
		frmRegistrieren.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Passwort wiederholen");
		lblNewLabel_4.setBounds(23, 189, 178, 14);
		frmRegistrieren.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ich akzeptiere die AGBs");
		rdbtnNewRadioButton.setBounds(23, 220, 178, 23);
		frmRegistrieren.getContentPane().add(rdbtnNewRadioButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(211, 64, 159, 20);
		frmRegistrieren.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(211, 89, 159, 20);
		frmRegistrieren.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(211, 114, 159, 20);
		frmRegistrieren.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(211, 139, 159, 20);
		frmRegistrieren.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(211, 164, 159, 20);
		frmRegistrieren.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(211, 189, 159, 20);
		frmRegistrieren.getContentPane().add(textField_7);
		
		JButton btnRegistrieren = new JButton("Registrieren");
		btnRegistrieren.setBounds(213, 220, 106, 23);
		frmRegistrieren.getContentPane().add(btnRegistrieren);
		this.frmRegistrieren.setVisible(true);
	}
}
