package TestData;

import java.sql.Date;
import java.util.ArrayList;

import model.Bestellung;

public class BestellungTestData {
	
	public static ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
	
	public BestellungTestData(){
		bestellungen.add(new Bestellung(KundeTestData.kunde, MitarbeiterTestData.mitarbeiter, 123331, "Versand bereit", new Date(2016, 7, 22), new ArtikelTestData().artikel, "in Lieferung"));
	}
	
}
