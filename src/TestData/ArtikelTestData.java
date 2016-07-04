package TestData;

import java.util.ArrayList;

import model.Artikel;

public class ArtikelTestData {
	public static ArrayList<Artikel> artikel = new ArrayList<Artikel>();
	
	public ArtikelTestData() {
		artikel.add(new Artikel(231233, 21, "Shampoo"));		
	}
}
