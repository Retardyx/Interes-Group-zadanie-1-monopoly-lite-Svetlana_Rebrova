package Monopol;

public class Vazenie extends Policko{

	public Vazenie(int poradie, String nazov,String popisPola) {
		super(poradie, nazov, popisPola);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.setVazba(true);
		System.out.println("Ides do vazenia, stojis pokial nehodis 6");
	}
	
}
