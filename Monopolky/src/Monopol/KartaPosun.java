package Monopol;

public class KartaPosun extends Karta {

	public KartaPosun(String popisKarty) {
		super(popisKarty);
	}

	@Override
	void vykonajAkciu(Hrac hrac) {
		hrac.setPolohaId(12);
	}

}
