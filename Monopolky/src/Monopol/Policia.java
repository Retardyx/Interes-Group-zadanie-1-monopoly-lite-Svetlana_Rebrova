package Monopol;


public class Policia extends Policko{

	public Policia(int poradie, String nazov,String popisPola) {
		super(poradie, nazov, popisPola);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.setZachytka(3);
		hrac.setPolohaId(6);
		System.out.println("Ides na zachytku, stojis 3 kola");
	}
}
