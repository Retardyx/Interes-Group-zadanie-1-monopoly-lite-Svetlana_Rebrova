package Monopol;

public class Startik extends Policko{

	public Startik(int poradie, String nazov,String popisPola) {
		super(poradie, nazov, popisPola);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.pripisPeniaze(25000);
	}
	
}
