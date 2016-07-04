package model;

public class Mitarbeiter {
	
	private int maId;
	private String nachname;
	private String vorname;
	
	
	/**
	 * Konstruktor Klasse Mitarbeiter
	 * @param maId
	 * @param nachname
	 * @param vorname
	 */
	public Mitarbeiter(int maId, String nachname, String vorname){
		this.maId = maId;
		this.nachname = nachname;
		this.vorname = vorname;
	}

	/**
	 * @return the maId
	 */
	public int getMaId() {
		return maId;
	}

	/**
	 * @param maId the maId to set
	 */
	public void setMaId(int maId) {
		this.maId = maId;
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
	
	

}
