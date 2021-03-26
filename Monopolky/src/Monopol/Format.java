package Monopol;

//import java.util.concurrent.TimeUnit;

public class Format{

	private String posunHraca;
	private String okrajPolicka;
	private String okrajAvatara;
	private char lomka;
	
	private String avatar1= "(^_^)";
	private String avatar2 = "(o_O)";
	private String avatar3 = "($_$)";
	private String avatar4 = "(*o*)";
	private String avatar5 = "(^_-)";
	private String avatar6 = "(x_x)";
	private String avatar7 = "(_!_)";

	public Format() {
		this.okrajPolicka = "_________________";
		this.lomka = '|';
		this.okrajAvatara = "_______";
	}
	
	public void vypisMonopoly() {
		System.out.print("\n\n\n\n");
		System.out.print(
				   "  ____________________________________________________________________________________________________________          \n" +
				   " |  ____     ____    _______    ____    ___    _______    _______     _______    ___     __     __            |         \n" + 
				   " | |    \\   /    |  /   _   \\  |    \\  |   |  /   _   \\  |    _  \\   /   _   \\  |   |   \\  \\   /  /           | \n" + 
				   " | |     \\_/     | |   | |   | |     \\ |   | |   | |   | |   |_|  | |   | |   | |   |    \\  \\_/  /            |     \n" + 
				   " | |   |\\___/|   | |   | |   | |   |\\ \\|   | |   | |   | |    ___/  |   | |   | |   |__   \\     /             |     \n" +
				   " | |   |     |   | |   |_|   | |   | \\     | |   |_|   | |   |      |   |_|   | |      |   |   |              |        \n" + 
				   " | |___|     |___|  \\_______/  |___|  \\____|  \\_______/  |___|       \\_______/  |______|   |___|              |     \n" +    
				   " |________________________________________________________________________________________        Made by     |         \n" +
				   "                                                                                          |  Svetlana Rebrova |         \n" + 
				   "                                                                                          |___________________|         \n\n\n\n"
				   );
	}
	
	public void vyberAvatara() {
		System.out.printf("\n%20s" , "Vyber si svojho avatara");
		System.out.printf("\n%9s%12s%12s%12s%12s%12s%12s" , okrajAvatara, okrajAvatara, okrajAvatara, okrajAvatara, okrajAvatara, okrajAvatara, okrajAvatara);
		System.out.printf("\n%2c%8c%4c%8c%4c%8c%4c%8c%4c%8c%4c%8c%4c%8c" , lomka,  lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka, lomka);
		System.out.printf("\n%2c%6s%2c%4c%6s%2c%4c%6s%2c%4c%6s%2c%4c%6s%2c%4c%6s%2c%4c%6s%2c" , lomka, avatar1, lomka, lomka, avatar2, lomka, lomka, avatar3, lomka, lomka, avatar4, lomka, lomka, avatar5, lomka, lomka, avatar6, lomka, lomka, avatar7, lomka);
		System.out.printf("\n%2c%s%c%4c%s%c%4c%s%c%4c%s%c%4c%s%c%4c%s%c%4c%s%c" , lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka, lomka, okrajAvatara, lomka);
		System.out.printf("\n     Q\t\t W\t     E\t\t R\t     T\t\t Y\t     U\n\n" );
	}
	public void logoHraca(Hrac hrac) {
		int velkost = hrac.getMeno().length();
		
		if(velkost > 7) {
			System.out.print("\t\t        ");
			for (int i = 0; i < velkost; i++) {
				System.out.print("_");
			}
			System.out.print("\n\t\t       |");
			for (int i = 0; i < velkost; i++) {
				System.out.print(" ");
			}
			System.out.print("|\n\t\t       |");
			for (int i = 0; i < velkost-5; i++) {
				if(i == (velkost - 6)/2) {
					System.out.print(hrac.getAvatar());
					System.out.print(" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("|\n\t\t       |");
			for (int i = 0; i < velkost; i++) {
				System.out.print("_");
			}
			System.out.print("|\n\t\t       |" + hrac.getMeno() + "|\n \t\t       |");
			for (int i = 0; i < velkost; i++) {
				System.out.print("_");
			}
			System.out.print("|\n");
			
		}else {
			System.out.printf("\t\t       %9s\n", okrajAvatara);
			System.out.printf("\t\t       %2c%8c\n", lomka, lomka);
			System.out.printf("\t\t       %2c%6s%2c\n", lomka, hrac.getAvatar(), lomka);
			System.out.printf("\t\t       %2c%s%c\n", lomka, okrajAvatara, lomka);
			System.out.printf("\t\t       %2c%-7s%c\n", lomka, hrac.getMeno(), lomka);
			System.out.printf("\t\t       %2c%s%c\n", lomka,okrajAvatara, lomka);
		}
	}
	
	public void detailHraca(Hrac hrac) {
		int pocetK = hrac.getMajetok().size();
		Nehnutelnost aktN = null;
		

			System.out.print(" __________ ");
			if(pocetK > 0) 
				System.out.print("  _______________________________________________");
			System.out.print("\n|  " + hrac.getAvatar() + "   |");
			if(pocetK > 0)
				System.out.print(" | ID |  HODNOTA  |  STOJNE  | NAZOV             |");
			System.out.printf("\n|%10s|", hrac.getMeno());
			if(pocetK > 0) {
				aktN = hrac.getMajetok().get(0);
				System.out.printf(" |%3d |%8d$%3c%7d$%3c %-18s%c", aktN.getPoradie(), aktN.getHodnota(), lomka, aktN.getStojne(), lomka, aktN.getNazov(), lomka);
			}
			System.out.printf("\n|%9d$%c", hrac.getLovky(), lomka);
			if(pocetK > 1) {
				aktN = hrac.getMajetok().get(1);
				System.out.printf(" |%3d |%8d$%3c%7d$%3c %-18s%c", aktN.getPoradie(), aktN.getHodnota(), lomka, aktN.getStojne(), lomka, aktN.getNazov(), lomka);
			}
			else if(pocetK == 1)
				System.out.print(" |____|___________|__________|___________________|");
			
				System.out.printf("\n|__________|");
			if(pocetK > 2) {
				aktN = hrac.getMajetok().get(2);
				System.out.printf(" |%3d |%8d$%3c%7d$%3c %-18s%c", aktN.getPoradie(), aktN.getHodnota(), lomka, aktN.getStojne(), lomka, aktN.getNazov(), lomka);
			}
			else if(pocetK == 2)
				System.out.print(" |____|___________|__________|___________________|");
			
			if(pocetK > 2)
				System.out.print("\n\t    ");
			if(pocetK > 3) {
				aktN = hrac.getMajetok().get(3);
				System.out.printf(" |%3d |%8d$%3c%7d$%3c %-18s%c\n", aktN.getPoradie(), aktN.getHodnota(), lomka, aktN.getStojne(), lomka, aktN.getNazov(), lomka);
			}
			else if(pocetK == 3)
				System.out.print(" |____|___________|__________|___________________|");
			if(pocetK > 4) {
				for(int i = 4; i < pocetK; i++) {
					System.out.printf("%14c%3d |%8d$%3c%7d$%3c %-18s%c\n", lomka, aktN.getPoradie(), aktN.getHodnota(), lomka, aktN.getStojne(), lomka, aktN.getNazov(), lomka);
				}
				System.out.print("\t     |____|___________|__________|___________________|");
			}
			
		
		
	}
	
	public void naTahuJe(Hrac hrac) {
			
		System.out.print( "\t     < < <    Na tahu je hrac    > > > \n");
			logoHraca(hrac);	 
	}
	
	public void vypisPolicok(Policko policko1, Policko policko2, int hodeneCislo) {
	
		this.posunHraca = " ->-> posun o " + hodeneCislo + "  ->->";
	
		
		if(policko1.getClass() == Monopol.Nehnutelnost.class && policko2.getClass() == Monopol.Nehnutelnost.class) {

			Nehnutelnost neh1 = (Nehnutelnost)policko1;
			Nehnutelnost neh2 = (Nehnutelnost)policko2;
			System.out.printf("\n%18s%40s", okrajPolicka, okrajPolicka);
			System.out.printf("\n%c%2d%16c%22c%2d%16c" , lomka, neh1.getPoradie(), lomka, lomka, neh2.getPoradie(), lomka);
			System.out.printf("\n%c%17s%1c%22c%17s%1c", lomka, neh1.getNazov(), lomka, lomka, neh2.getNazov(), lomka);
			System.out.printf("\n%c%s%c%22c%s%c" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
			System.out.printf("\n%c%18c%22c%18c" , lomka, lomka, lomka, lomka);
			System.out.printf("\n%c%-7s%8d \u0024%1c%s%c%-7s%8d \u0024%1c", lomka, "Hodnota", neh1.getHodnota() ,lomka, posunHraca, lomka, "Hodnota", neh2.getHodnota() ,lomka);
			System.out.printf("\n%c%-7s%8d \u0024%1c%22c%-7s%8d \u0024%1c", lomka, "Stojne", 2000 ,lomka, lomka, "Stojne", 3000 ,lomka);
			if(neh1.getMajitel() == null && neh2.getMajitel() == null)
				System.out.printf("\n%c%-7s%9s%2c%22c%-7s%9s%2c", lomka, "Majitel", "BANKA" ,lomka, lomka, "Majitel", "BANKA" ,lomka);
			else if (neh1.getMajitel() == null)
				System.out.printf("\n%c%-7s%9s%2c%22c%-7s%9s%2c", lomka, "Majitel", "BANKA" ,lomka, lomka, "Majitel", neh2.getMajitel().getMeno() ,lomka);
			else if (neh2.getMajitel() == null)
				System.out.printf("\n%c%-7s%9s%2c%22c%-7s%9s%2c", lomka, "Majitel", neh1.getMajitel().getMeno() ,lomka, lomka, "Majitel", "BANKA" ,lomka);
			else
				System.out.printf("\n%c%-7s%9s%2c%22c%-7s%9s%2c", lomka, "Majitel", neh1.getMajitel().getMeno() ,lomka, lomka, "Majitel", neh2.getMajitel().getMeno() ,lomka);
			System.out.printf("\n%c%s%c%22c%s%c\n" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
		}
		else if (policko1.getClass() == Monopol.Nehnutelnost.class) {
			Nehnutelnost neh1 = (Nehnutelnost)policko1;
			Policko pol2 = policko2;
			String str = "";
			String str2 = "";
			if(pol2.getPopis().length()>17) {
				str = pol2.getPopis().substring(0, 17);
				str2 = pol2.getPopis().substring(17);
			}
			else 
				 str = pol2.getPopis();
			
			System.out.printf("\n%18s%40s", okrajPolicka, okrajPolicka);
			System.out.printf("\n%c%2d%16c%22c%2d%16c" , lomka, neh1.getPoradie(), lomka, lomka, pol2.getPoradie(), lomka);
			System.out.printf("\n%c%17s%1c%22c%13s%5c", lomka, neh1.getNazov(), lomka, lomka, pol2.getNazov(), lomka);
			System.out.printf("\n%c%s%c%22c%s%c" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
			System.out.printf("\n%c%18c%22c%18c" , lomka, lomka, lomka, lomka);
			System.out.printf("\n%c%-7s%8d \u0024%1c%s%c%17s%1c", lomka, "Hodnota", neh1.getHodnota() ,lomka, posunHraca, lomka, str ,lomka);
			System.out.printf("\n%c%-7s%8d \u0024%1c%22c%17s%1c", lomka, "Stojne", 2000 ,lomka, lomka, str2, lomka);
			if(neh1.getMajitel() == null)
				System.out.printf("\n%c%-7s%9s%2c%22c%18c", lomka, "Majitel", "BANKA" ,lomka, lomka, lomka);
			else
				System.out.printf("\n%c%-7s%9s%2c%22c%18c", lomka, "Majitel", neh1.getMajitel().getMeno() ,lomka, lomka, lomka);
			System.out.printf("\n%c%s%c%22c%s%c\n" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
		}
		else if (policko2.getClass() == Monopol.Nehnutelnost.class) {
			Nehnutelnost neh2 = (Nehnutelnost)policko2;
			Policko pol1 = policko1;
			
			String str = "";
			String str2 = "";
			if(pol1.getPopis().length()>17) {
				str = pol1.getPopis().substring(0, 17);
				str2 = pol1.getPopis().substring(17);
			}
			else 
				 str = pol1.getPopis();
			
			System.out.printf("\n%18s%40s", okrajPolicka, okrajPolicka);
			System.out.printf("\n%c%2s%16c%22c%2s%16c" , lomka, pol1.getPoradie(), lomka, lomka, neh2.getPoradie(), lomka);
			System.out.printf("\n%c%12s%6c%22c%17s%1c", lomka, pol1.getNazov(), lomka, lomka, neh2.getNazov(), lomka);
			System.out.printf("\n%c%s%c%22c%s%c" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
			System.out.printf("\n%c%18c%22c%18c" , lomka, lomka, lomka, lomka);
			System.out.printf("\n%c%-7s%1c%s%c%-7s%8d \u0024%1c", lomka, str, lomka, posunHraca, lomka, "Hodnota", neh2.getHodnota() ,lomka);
			System.out.printf("\n%c%-17s%c%22c%-7s%8d \u0024%1c", lomka, str2 ,lomka, lomka, "Stojne", neh2.getStojne() ,lomka);
			if(neh2.getMajitel() == null)	
			System.out.printf("\n%c%18c%22c%-7s%9s%2c", lomka, lomka, lomka, "Majitel", "BANKA" ,lomka);
			else
				System.out.printf("\n%c%18c%22c%-7s%9s%2c", lomka, lomka, lomka, "Majitel", neh2.getMajitel().getMeno() ,lomka);
			System.out.printf("\n%c%s%c%22c%s%c\n" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
		}
		else {
			Policko pol1 = policko1;
			Policko pol2 = policko2;
			String stra = "";
			String stra2 = "";
			String strb = "";
			String strb2 = "";

			if(pol1.getPopis().length()>17) {
				stra = pol1.getPopis().substring(0, 17);
				stra2 = pol1.getPopis().substring(17);
			}
			else 
				 stra = pol1.getPopis();
			
			if(pol2.getPopis().length()>17) {
				strb = pol2.getPopis().substring(0, 17);
				strb2 = pol2.getPopis().substring(17);
				
			}
			else 
				 strb = pol2.getPopis();
			
			System.out.printf("\n%18s%40s", okrajPolicka, okrajPolicka);
			System.out.printf("\n%c%2d%16c%22c%2d%16c" , lomka, pol1.getPoradie(), lomka, lomka, pol2.getPoradie(), lomka);
			System.out.printf("\n%c%12s%6c%22c%12s%6c", lomka, pol1.getNazov(), lomka, lomka, pol2.getNazov(), lomka);
			System.out.printf("\n%c%s%c%22c%s%c" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
			System.out.printf("\n%c%18c%22c%18c" , lomka, lomka, lomka, lomka);
			System.out.printf("\n%c%-7s%1c%s%c%-7s%1c", lomka, stra,lomka, posunHraca, lomka, strb ,lomka);
			System.out.printf("\n%c%-17s%c%22c%17s%1c", lomka, stra2 ,lomka, lomka, strb2 ,lomka);
			System.out.printf("\n%c%18c%22c%18c", lomka ,lomka, lomka,lomka);
			System.out.printf("\n%c%s%c%22c%s%c\n" , lomka, okrajPolicka, lomka, lomka, okrajPolicka, lomka);
		
		}
			
	}
	
	/**
	 * Metoda vytlaci na konzolu kartu sanca
	 */
	public void karta(Karta karta) {
		String popis1 = "";
		String popis2 = "";
		String popis3 = "";
		String popis4 = "";
		int rozdel = 0;
	
		if(karta.getPopisKarty().length() > 17) {
			
			for(int i = 0; i < 17; i++) {
				if (karta.getPopisKarty().charAt(i) == ' ') {
					rozdel = i + 1;
				}
			}
			popis1 = karta.getPopisKarty().substring(0, rozdel);
			popis2 = karta.getPopisKarty().substring(rozdel);
			
			if(popis2.length() >= 17) {
				for(int i = 0; i < 17; i++) {
					if (karta.getPopisKarty().charAt(i) == ' ') {
						rozdel = i + 1;
					}
				}
				popis3 = popis2.substring(rozdel);
				popis2 = popis2.substring(0, rozdel);	
				if (popis3.length() >= 17) {
					for(int i = 0; i < 17; i++) {
						if (karta.getPopisKarty().charAt(i) == ' ') {
							rozdel = i + 2;
						}
					}
				}
				popis4 = popis3.substring(rozdel);
				popis3 = popis3.substring(0, rozdel);	
		}
		}
		System.out.println(popis1);
		System.out.println(popis2);
		System.out.println(popis3);
		
		System.out.printf("\n%38s", okrajPolicka);
		System.out.printf("\n%21c%18c", lomka ,lomka);
		System.out.printf("\n%21c%-17s%c" , lomka, popis1 , lomka );
		System.out.printf("\n%21c%-17s%c" , lomka, popis2 , lomka );
		System.out.printf("\n%21c%-17s%c" , lomka, popis3 , lomka );
		System.out.printf("\n%21c%-17s%c" , lomka, popis4 , lomka );
		System.out.printf("\n%21c%s%c", lomka, okrajPolicka, lomka);

	
	}
}


