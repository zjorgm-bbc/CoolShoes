package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Button;

public class Bestellungen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bestellungen window = new Bestellungen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bestellungen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(164, 11, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblBestellung = new JLabel("Bestellung");
		lblBestellung.setBounds(33, 11, 72, 14);
		frame.getContentPane().add(lblBestellung);
		
		Panel panel = new Panel();
		panel.setBounds(33, 31, 283, 46);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("1234122");
		label.setBounds(0, 11, 46, 14);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Lieferung versandbereit");
		lblNewLabel.setBounds(132, 11, 130, 14);
		panel.add(lblNewLabel);
		
		Button button = new Button("Abmelden");
		button.setBounds(246, 273, 70, 22);
		frame.getContentPane().add(button);
	}
}
