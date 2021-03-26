package Monopol;

abstract class Policko {

	private String popisPola;
	private String nazov;
	private int poradie;
	
	public Policko(int poradie, String nazov, String popisPola) {
		this.popisPola = popisPola;
		this.poradie = poradie;
		this.nazov = nazov;
	}
	
	
	public int getPoradie() {
		return poradie;
	}

	public String getPopis() {
		return popisPola;
	}
	
	abstract void vykonajAkciu(Hrac hrac);

	public String getNazov() {
		return nazov;
	}

}
