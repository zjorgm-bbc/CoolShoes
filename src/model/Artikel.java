package model;

public class Artikel {
	
	private int artikelnummer;
	private int bestand;
	private String name;
	
	/**
	 *  Konstruktor Klasse Artikel
	 * @param artikelnummer
	 * @param bestand
	 * @param name
	 */
	public Artikel(int artikelnummer, int bestand, String name){
		this.artikelnummer = artikelnummer;
		this.bestand = bestand;
		this.name = name;
	}

	/**
	 * @return the artikelnummer
	 */
	public int getArtikelnummer() {
		return artikelnummer;
	}

	/**
	 * @param artikelnummer the artikelnummer to set
	 */
	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	/**
	 * @return the bestand
	 */
	public int getBestand() {
		return bestand;
	}

	/**
	 * @param bestand the bestand to set
	 */
	public void setBestand(int bestand) {
		this.bestand = bestand;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	

	
	
}
