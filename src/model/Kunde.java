package model;

public class Kunde {
	
	private int kundennummer;
	private String email;
	private String passwort;
	private String nachname;
	private String vorname;
	private String strasse;
	private String ort;
	private int plz;
	
	/**
	 * Konstruktor Klasse Kunde
	 * @param kundennummer
	 * @param email
	 * @param passwort
	 * @param nachname
	 * @param vorname
	 * @param strasse
	 * @param ort
	 * @param plz
	 */
	public Kunde(int kundennummer, String email, String passwort, String nachname, 
			String vorname, String strasse, String ort, int plz){
		this.kundennummer = kundennummer;
		this.email = email;
		this.passwort  = passwort;
		this.nachname = nachname;
		this.vorname = vorname;
		this.strasse = strasse;
		this.ort = ort;
		this.plz = plz;
	}

	/**
	 * @return the kundennummer
	 */
	public int getKundennummer() {
		return kundennummer;
	}

	/**
	 * @param kundennummer the kundennummer to set
	 */
	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the passwort
	 */
	public String getPasswort() {
		return passwort;
	}

	/**
	 * @param passwort the passwort to set
	 */
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	/**
	 * @return the nachname
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param nachname the nachname to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return the vorname
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param vorname the vorname to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the strasse
	 */
	public String getStrasse() {
		return strasse;
	}

	/**
	 * @param strasse the strasse to set
	 */
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	/**
	 * @return the ort
	 */
	public String getOrt() {
		return ort;
	}

	/**
	 * @param ort the ort to set
	 */
	public void setOrt(String ort) {
		this.ort = ort;
	}

	/**
	 * @return the plz
	 */
	public int getPlz() {
		return plz;
	}

	/**
	 * @param plz the plz to set
	 */
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	

}
