package model;

import java.sql.Date;
import java.util.ArrayList;

public class Bestellung {
	
	private Kunde kunde;
	private Mitarbeiter zuständiger;
	private int bestellnummer;
	private String bestellstatus;
	private Date bestelldatum;
	private ArrayList<Artikel> artikel;
	private String lieferungsStatus;
	
	
	/**
	 * Konstruktor Klasse Bestellung
	 * @param kunde
	 * @param zuständiger
	 * @param bestellnummer
	 * @param bestellstatus
	 * @param bestelldatum
	 * @param artikel
	 * @param lieferungsStatus
	 */
	public Bestellung(Kunde kunde, Mitarbeiter zuständiger, int bestellnummer, 
			String bestellstatus, Date bestelldatum, ArrayList<Artikel> artikel,
			String lieferungsStatus){
		this.kunde = kunde;
		this.zuständiger = zuständiger;
		this.bestellnummer = bestellnummer;
		this.bestellstatus = bestellstatus;
		this.bestelldatum = bestelldatum;
		this.artikel = artikel;
		this.lieferungsStatus = lieferungsStatus;
	}

	/**
	 * @return the kunde
	 */
	public Kunde getKunde() {
		return kunde;
	}

	/**
	 * @param kunde the kunde to set
	 */
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	/**
	 * @return the zuständiger
	 */
	public Mitarbeiter getZuständiger() {
		return zuständiger;
	}

	/**
	 * @param zuständiger the zuständiger to set
	 */
	public void setZuständiger(Mitarbeiter zuständiger) {
		this.zuständiger = zuständiger;
	}

	/**
	 * @return the bestellnummer
	 */
	public int getBestellnummer() {
		return bestellnummer;
	}

	/**
	 * @param bestellnummer the bestellnummer to set
	 */
	public void setBestellnummer(int bestellnummer) {
		this.bestellnummer = bestellnummer;
	}

	/**
	 * @return the bestellstatus
	 */
	public String getBestellstatus() {
		return bestellstatus;
	}

	/**
	 * @param bestellstatus the bestellstatus to set
	 */
	public void setBestellstatus(String bestellstatus) {
		this.bestellstatus = bestellstatus;
	}

	/**
	 * @return the bestelldatum
	 */
	public Date getBestelldatum() {
		return bestelldatum;
	}

	/**
	 * @param bestelldatum the bestelldatum to set
	 */
	public void setBestelldatum(Date bestelldatum) {
		this.bestelldatum = bestelldatum;
	}

	/**
	 * @return the artikel
	 */
	public ArrayList<Artikel> getArtikel() {
		return artikel;
	}

	/**
	 * @param artikel the artikel to set
	 */
	public void setArtikel(ArrayList<Artikel> artikel) {
		this.artikel = artikel;
	}

	/**
	 * @return the lieferungsStatus
	 */
	public String getLieferungsStatus() {
		return lieferungsStatus;
	}

	/**
	 * @param lieferungsStatus the lieferungsStatus to set
	 */
	public void setLieferungsStatus(String lieferungsStatus) {
		this.lieferungsStatus = lieferungsStatus;
	}
	
	
	

}
