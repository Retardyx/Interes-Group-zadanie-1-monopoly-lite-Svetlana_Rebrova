package Monopol;

public class KartaDarcek extends Karta{

	public KartaDarcek( String popisKarty) {
		super(popisKarty);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		hrac.pripisPeniaze(25000);
	}	
}
