package view;

import java.awt.Button;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bestellungen {

	private JFrame frame;

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
		frame.setBounds(100, 100, 471, 127);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(246, 11, 46, 14);
		frame.getContentPane().add(lblStatus);

		JLabel lblBestellung = new JLabel("Bestellung");
		lblBestellung.setBounds(33, 11, 72, 14);
		frame.getContentPane().add(lblBestellung);

		Panel panel = new Panel();
		panel.setBounds(33, 31, 408, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("1234122");
		label.setBounds(0, 11, 202, 14);
		panel.add(label);

		JLabel lblNewLabel = new JLabel("Lieferung versandbereit");
		lblNewLabel.setBounds(212, 11, 186, 14);
		panel.add(lblNewLabel);

		Button button = new Button("Abmelden");
		button.setBounds(201, 72, 70, 22);
		frame.getContentPane().add(button);
		this.frame.setVisible(true);

		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SignIn();
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BestellungDetails(panel);
			}
		});
	}
}
