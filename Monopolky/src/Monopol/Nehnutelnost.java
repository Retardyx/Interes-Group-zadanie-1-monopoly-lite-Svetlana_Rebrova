package Monopol;

import java.util.Scanner;

public class Nehnutelnost extends Policko{

	private String popisPola;
	private int hodnota;
	private Hrac majitel;
	private int stojne;
	private Scanner scan;
	
	public Nehnutelnost(String popisPola, int hodnota, int stojne, Hrac majitel,int poradie, String nazov) {
		super(poradie, nazov, popisPola);
		this.popisPola = popisPola;
		this.hodnota = hodnota;
		this.stojne = stojne;
		this.majitel = majitel;
		
	}
		
	public String getPopisPola() {
		return popisPola;
	}

	public void setPopisPola(String popisPola) {
		this.popisPola = popisPola;
	}

	public int getHodnota() {
		return hodnota;
	}
	
	public int getStojne() {
		return stojne;
	}
	
	public Hrac getMajitel() {
		return majitel;
	}
	
	public void setMajitel(Hrac obchodnik) {
		this.majitel = obchodnik;		
	}

	@Override
	public void vykonajAkciu(Hrac hrac) {
		
		if(majitel == null) {
			if(hrac.getLovky() > hodnota) {
				scan = new Scanner(System.in);
				System.out.println("Tuto ulicu este nikto nevlastni, zelas si ju kupit? (A/N)");
				String volba = scan.next();
				
				if (volba.equalsIgnoreCase("a")) {
					majitel = hrac;
					hrac.pridajNehnutelnost(this);
					hrac.Pokuta(hodnota);
					System.out.println("Kupil si si ulicu");
				}
			}
			else {
				System.out.println("Na tuto ulicu nemas dost penazi.");
			}
		}else {
			hrac.Pokuta(stojne);
			if(hrac.getLovky() < 0) 
				System.out.println("Nemas na dostatok penazi na zaplatenie stojneho, prehral si! ");
			else 
				System.out.println("Tuto ulicu uz vlastni " + majitel.getMeno() + ". Musis zaplatit stojne " + stojne + " $.");
			
		}
		
	}

}
