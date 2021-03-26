package Monopol;

public class KartaPosun2 extends Karta{

	public KartaPosun2(String popisKarty) {
		super(popisKarty);
	}

	@Override
	void vykonajAkciu(Hrac hrac) {
		hrac.setPolohaId(23);
	}

}
