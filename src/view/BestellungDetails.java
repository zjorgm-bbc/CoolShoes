package view;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BestellungDetails {

	private JFrame frmDetails;

	/**
	 * Create the application.
	 * @param panel 
	 */
	public BestellungDetails(Panel panel) {
		initialize();
		this.frmDetails.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDetails = new JFrame();
		frmDetails.setTitle("Details");
		frmDetails.setBounds(100, 100, 322, 198);
		frmDetails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDetails.getContentPane().setLayout(null);
		
		JLabel lblBestellnr = new JLabel("BestellNr.");
		lblBestellnr.setBounds(10, 11, 175, 14);
		frmDetails.getContentPane().add(lblBestellnr);
		
		JLabel lblArtikel = new JLabel("Artikel");
		lblArtikel.setBounds(10, 36, 175, 14);
		frmDetails.getContentPane().add(lblArtikel);
		
		JLabel lblZustndiger = new JLabel("Zust\u00E4ndiger");
		lblZustndiger.setBounds(10, 61, 175, 14);
		frmDetails.getContentPane().add(lblZustndiger);
		
		JLabel lblBestellstatus = new JLabel("Bestellstatus");
		lblBestellstatus.setBounds(10, 86, 175, 14);
		frmDetails.getContentPane().add(lblBestellstatus);
		
		JLabel lblVoraussichtlichesLieferdatum = new JLabel("Voraussichtliches Lieferdatum");
		lblVoraussichtlichesLieferdatum.setBounds(10, 111, 175, 14);
		frmDetails.getContentPane().add(lblVoraussichtlichesLieferdatum);
		
		JLabel lblNewLabel = new JLabel("Bestellnr");
		lblNewLabel.setBounds(195, 11, 109, 14);
		frmDetails.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("artikel");
		lblNewLabel_1.setBounds(195, 36, 109, 14);
		frmDetails.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("zust\u00E4ndiger");
		lblNewLabel_2.setBounds(195, 61, 109, 14);
		frmDetails.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("bestellstatus");
		lblNewLabel_3.setBounds(195, 86, 109, 14);
		frmDetails.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("datum");
		lblNewLabel_4.setBounds(195, 111, 109, 14);
		frmDetails.getContentPane().add(lblNewLabel_4);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(111, 137, 91, 23);
		frmDetails.getContentPane().add(btnZurck);
		btnZurck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmDetails.dispose();
			}
		});
	}

}
