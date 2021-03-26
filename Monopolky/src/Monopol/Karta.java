package Monopol;

public abstract class Karta {
	
	private String popisKarty;
	
	public Karta(String popisKarty) {
		this.popisKarty = popisKarty;
	}
	
	public String getPopisKarty() {
		return popisKarty;
	}

	abstract void vykonajAkciu(Hrac hrac);
}
