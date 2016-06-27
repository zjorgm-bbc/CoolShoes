package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BestellungDetails {

	private JFrame frmDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BestellungDetails window = new BestellungDetails();
					window.frmDetails.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BestellungDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDetails = new JFrame();
		frmDetails.setTitle("Details");
		frmDetails.setBounds(100, 100, 251, 198);
		frmDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDetails.getContentPane().setLayout(null);
		
		JLabel lblBestellnr = new JLabel("BestellNr.");
		lblBestellnr.setBounds(10, 11, 46, 14);
		frmDetails.getContentPane().add(lblBestellnr);
		
		JLabel lblArtikel = new JLabel("Artikel");
		lblArtikel.setBounds(10, 36, 46, 14);
		frmDetails.getContentPane().add(lblArtikel);
		
		JLabel lblZustndiger = new JLabel("Zust\u00E4ndiger");
		lblZustndiger.setBounds(10, 61, 57, 14);
		frmDetails.getContentPane().add(lblZustndiger);
		
		JLabel lblBestellstatus = new JLabel("Bestellstatus");
		lblBestellstatus.setBounds(10, 86, 84, 14);
		frmDetails.getContentPane().add(lblBestellstatus);
		
		JLabel lblVoraussichtlichesLieferdatum = new JLabel("Voraussichtliches Lieferdatum");
		lblVoraussichtlichesLieferdatum.setBounds(10, 111, 160, 14);
		frmDetails.getContentPane().add(lblVoraussichtlichesLieferdatum);
		
		JLabel lblNewLabel = new JLabel("Bestellnr");
		lblNewLabel.setBounds(178, 11, 46, 14);
		frmDetails.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("artikel");
		lblNewLabel_1.setBounds(178, 36, 46, 14);
		frmDetails.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("zust\u00E4ndiger");
		lblNewLabel_2.setBounds(178, 61, 46, 14);
		frmDetails.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("bestellstatus");
		lblNewLabel_3.setBounds(178, 86, 46, 14);
		frmDetails.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("datum");
		lblNewLabel_4.setBounds(178, 111, 46, 14);
		frmDetails.getContentPane().add(lblNewLabel_4);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(133, 136, 91, 23);
		frmDetails.getContentPane().add(btnZurck);
	}

}
