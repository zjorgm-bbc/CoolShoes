package view;

import java.awt.Choice;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import TestData.BestellungTestData;
import model.Bestellung;

public class BestellungDetails {

	private JFrame frmDetails;
	private Bestellung bestellung= new Bestellung();

	/**
	 * Create the application.
	 * 
	 * @param panel
	 */
	public BestellungDetails(Panel panel) {
		bestellung = Bestellung.getBestellungByNr(Integer.parseInt(Bestellungen.label.getText()));
		initialize();
		this.frmDetails.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDetails = new JFrame();
		frmDetails.setTitle("Details");
		frmDetails.setBounds(100, 100, 430, 198);
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
		lblNewLabel.setBounds(199, 11, 213, 14);
		frmDetails.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(String.valueOf(bestellung.getBestellnummer()));

		// for(Artikel artikel : bestellung.getArtikel()){
		JLabel lblNewLabel_1 = new JLabel("artikel");
		lblNewLabel_1.setBounds(199, 36, 213, 14);
		frmDetails.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText(bestellung.getArtikel().get(0).getName());
		// }

		JLabel lblNewLabel_2 = new JLabel("zust\u00E4ndiger");
		lblNewLabel_2.setBounds(199, 61, 213, 14);
		frmDetails.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2
				.setText(bestellung.getZuständiger().getVorname() + " " + bestellung.getZuständiger().getNachname());

		JLabel lblNewLabel_4 = new JLabel("datum");
		lblNewLabel_4.setBounds(199, 111, 213, 14);
		frmDetails.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setText(bestellung.getBestelldatum().toString());

		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(111, 137, 91, 23);
		frmDetails.getContentPane().add(btnZurck);

		if (Bestellungen.isAdmin) {
			Choice choice = new Choice();
			choice.setBounds(199, 80, 203, 20);
			choice.addItem("Pausiert");
			choice.addItem("Versand bereit");
			choice.addItem("Geliefert");
			frmDetails.getContentPane().add(choice);
			choice.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					BestellungTestData.bestellungen.get(0).setLieferungsStatus(choice.getSelectedItem());
				}
			});
		} else {
			JLabel lblNewLabel_3 = new JLabel("bestellstatus");
			lblNewLabel_3.setBounds(195, 86, 109, 14);
			frmDetails.getContentPane().add(lblNewLabel_3);
			lblNewLabel_3.setText(bestellung.getBestellstatus());
		}

		btnZurck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmDetails.dispose();
			}
		});
	}
}
