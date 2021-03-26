package Monopol;

public class KartaZaplat extends Karta{

	public KartaZaplat(String popisKarty) {
		super(popisKarty);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.Pokuta(500);
		
	}

}
