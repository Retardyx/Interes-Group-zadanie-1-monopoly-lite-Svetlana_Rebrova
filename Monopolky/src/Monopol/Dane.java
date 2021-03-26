package Monopol;

import java.util.ArrayList;

public class Dane extends Policko{

	public Dane(int poradie, String nazov,String popisPola) {
		super(poradie, nazov, popisPola);
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		int hodnotaMajetku = 0;
		ArrayList<Nehnutelnost> majetok = hrac.getMajetok();
             for(int i = 0; i < majetok.size(); i++ ) {
            	 hodnotaMajetku += majetok.get(i).getHodnota(); 
             }
             int dan = hodnotaMajetku * 10 / 100;
             System.out.println("Platis 10% dan z celho majetku: " + dan);
             hrac.Pokuta(dan);
	}
	
}
