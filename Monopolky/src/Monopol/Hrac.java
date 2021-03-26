package Monopol;

import java.util.ArrayList;

public class Hrac {

	private String meno;
	private int lovky;
	private ArrayList<Nehnutelnost> majetok;
	private int polohaId;
	private int zachytka;
	private boolean vazba;
	private String avatar;
	
	public Hrac(String meno, String avatar ) {
		this.meno = meno;
		lovky = 20000;
		zachytka = 0;
		vazba = false;
		polohaId = 0;
		majetok = new ArrayList<>();
		this.avatar = avatar;
	}
		
	public String getMeno() {
		return meno;
	}

	public int getLovky() {
		return lovky;
	}

	public ArrayList<Nehnutelnost> getMajetok() {
		return majetok;
	}

	public int getPolohaId() {
		return polohaId;
	}


	public int getZachytka() {
		return zachytka;
	}

	public boolean isVazba() {
		return vazba;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

    
	
	public void vypisHraca() {
		System.out.println("Hrac: " + meno + "\nPeniaze: " + lovky + "\nMajetok: " + majetok);
	}

	public void Pokuta(int pokuta) {
		lovky -= pokuta;
		if (lovky<0) {
		}
	}
	
	public void pripisPeniaze(int suma) {
		lovky += suma;
	}

	public void setMajetok(ArrayList<Nehnutelnost> majetok) {
		this.majetok = majetok;
	}

	public void setPolohaId(int polohaId) {
		this.polohaId = polohaId;
	}

	public void setZachytka(int zachytka) {
		this.zachytka = zachytka;
	}

	public void setVazba(boolean vazba) {
		this.vazba = vazba;
	}

	public void pridajNehnutelnost(Nehnutelnost nehnutelnost) {
		majetok.add(nehnutelnost);
		
	}

	public String getAvatar() {
		return avatar;
	}

}
