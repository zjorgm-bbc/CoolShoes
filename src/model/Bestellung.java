package model;

import java.sql.Date;
import java.util.ArrayList;

import TestData.BestellungTestData;

public class Bestellung {
	
	private Kunde kunde;
	private Mitarbeiter zustšndiger;
	private int bestellnummer;
	private String bestellstatus;
	private Date bestelldatum;
	private ArrayList<Artikel> artikel;
	private String lieferungsStatus;
	
	
	/**
	 * Konstruktor Klasse Bestellung
	 * @param kunde
	 * @param zustšndiger
	 * @param bestellnummer
	 * @param bestellstatus
	 * @param bestelldatum
	 * @param artikel
	 * @param lieferungsStatus
	 */
	public Bestellung(Kunde kunde, Mitarbeiter zustšndiger, int bestellnummer, 
			String bestellstatus, Date bestelldatum, ArrayList<Artikel> artikel,
			String lieferungsStatus){
		this.kunde = kunde;
		this.zustšndiger = zustšndiger;
		this.bestellnummer = bestellnummer;
		this.bestellstatus = bestellstatus;
		this.bestelldatum = bestelldatum;
		this.artikel = artikel;
		this.lieferungsStatus = lieferungsStatus;
	}
	public Bestellung() {
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
	 * @return the zustšndiger
	 */
	public Mitarbeiter getZustšndiger() {
		return zustšndiger;
	}

	/**
	 * @param zustšndiger the zustšndiger to set
	 */
	public void setZustšndiger(Mitarbeiter zustšndiger) {
		this.zustšndiger = zustšndiger;
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
	
	public static Bestellung getBestellungByNr(int bestellNr){
		for(Bestellung bestellung : BestellungTestData.bestellungen){
			if(bestellung.getBestellnummer() == bestellNr){
				return bestellung;
			}
		}
		return null;
	}
}
