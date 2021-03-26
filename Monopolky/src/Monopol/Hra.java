package Monopol;

import java.util.Scanner;

public class Hra {

	private Scanner vstup;
	private HraciaPlocha hraciaPlocha;
	private Format formater;
    public Hra() {
		this.vstup = new Scanner(System.in);
		this.hraciaPlocha = new HraciaPlocha();
		hraciaPlocha.nastavHraciuPlochu();
		this.formater = new Format();
	}
	public void nastavHru() {
		formater.vypisMonopoly();
		System.out.println("'S' - start\n'K' - koniec\n" );
		String volba = vstup.next();
		 if(volba.equalsIgnoreCase("s")) {
			
			 System.out.println("Zvol pocet hracov 2-4: ");
			int pocetHracov = vstup.nextInt();

		while(pocetHracov<2 ||pocetHracov>4) { 
			System.out.println("Zadal si zly pocet hracov zadaj este raz");
			pocetHracov = vstup.nextInt();
		}
		for (int i = 1; i<=pocetHracov; i++) { 
		System.out.println("Zadaj meno " + i + ". hraca:");
			String meno = vstup.next();
			formater.vyberAvatara();
			volba = nastavAvatara(vstup.next());
			hraciaPlocha.pridajHraca(new Hrac(meno, volba));
		}
	}
		 else 
				 System.out.println("Ak nechces hrat nevadi :) ");
	}

	
	public void spustiHru() {

	while(hraciaPlocha.getSkupinaHracov().size() > 1) {
		Hrac aktualnyHrac;
		Policko policko1,policko2;
		char volba;
		int hodeneCislo;
		int kolo = 0;
		while(kolo < hraciaPlocha.getSkupinaHracov().size()) {
			aktualnyHrac = hraciaPlocha.getSkupinaHracov().get(kolo);
			policko1 = hraciaPlocha.getPolePolicok()[aktualnyHrac.getPolohaId()];
			formater.naTahuJe(aktualnyHrac);
		
			if(aktualnyHrac.getZachytka()>0) {
				aktualnyHrac.setZachytka(aktualnyHrac.getZachytka()-1);
				System.out.println("Hrac caka este " + aktualnyHrac.getZachytka() + " kola kym mu skonci zachytka");
				kolo++;
			}
			else {
			System.out.println("Pre hod kockou stlac A ");
			 volba = vstup.next().charAt(0);
			while(volba!='a') {
				System.out.println("Pre hod kockou stlac A");
				 volba = vstup.next().charAt(0);
			}
			hodeneCislo=hraciaPlocha.getKocka().getHodeneCislo();
			System.out.println("Hrac hodil: " + hodeneCislo);
			if(aktualnyHrac.isVazba()==true) {
				if(hodeneCislo == 6) 
					aktualnyHrac.setVazba(false);

			}
			else {
			aktualnyHrac.setPolohaId(aktualnyHrac.getPolohaId() + hodeneCislo);	
			policko2 = hraciaPlocha.getPolePolicok()[aktualnyHrac.getPolohaId()];
			formater.detailHraca(aktualnyHrac);
			formater.vypisPolicok(policko1,policko2, hodeneCislo);
			policko2.vykonajAkciu(aktualnyHrac);
			if(policko2.getClass() == Sanca.class) { 
				Karta karta = hraciaPlocha.PotiahniKartu();
				formater.karta(karta);
				karta.vykonajAkciu(aktualnyHrac);
			}
			if(aktualnyHrac.getLovky()<0) {
				hraciaPlocha.getSkupinaHracov().remove(aktualnyHrac);
				
				}
			}
			
		}
			kolo++;
		}
		}
		}
	private String nastavAvatara(String vyber) {
		
		char znak = vyber.toUpperCase().charAt(0);
		
		switch (znak) {
		case 'Q' : {
			return "(^_^)";
		}
		case 'W': {
			return "(o_O)";
		}
		case 'E': {
			return"($_$)";
		}
		case 'R': {
			return"(o)";	
		}
		case 'T': {
			return "(^_-)";
		}
		case 'Y': {
			return "(x_x)";
		}
		case 'U': {
			return "(!)";
		}
		default:
			return null;
		}
	}
	}
	

