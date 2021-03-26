package Monopol;

public class KartaPlusPeniaze extends Karta{

	public KartaPlusPeniaze(String popisKarty) {
		super(popisKarty);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.pripisPeniaze(5000);
	}

}
