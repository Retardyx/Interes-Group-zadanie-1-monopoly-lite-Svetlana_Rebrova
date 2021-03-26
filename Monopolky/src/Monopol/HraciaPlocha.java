package Monopol;

import java.util.ArrayList;


public class HraciaPlocha {
	
	private Policko[] polePolicok;
	private ArrayList<Karta> sadaKariet;
	private ArrayList<Hrac> skupinaHracov;
	private Kocka kocka;
	private int poradieK;

	public HraciaPlocha(){
		this.polePolicok = new Policko[24];
		this.sadaKariet = new ArrayList<Karta>();
		this.skupinaHracov = new ArrayList<>();
		this.kocka = new Kocka();
	}

	public void nastavHraciuPlochu() {
		
		
		sadaKariet.add(new KartaDarcek("Dostavas 25000$ od investora!"));
		sadaKariet.add(new KartaPosun("Ides sa pozriet na Raciansku!"));
		sadaKariet.add(new KartaPlusPeniaze("Z danovych vratiek si 9000 dostal na ucet!"));
		sadaKariet.add(new KartaPosun2("Zabludil si na Kadnarovu ulicu!"));
		sadaKariet.add(new KartaZaplat("Musis zaplatit pokutu 7000$!"));
		
		polePolicok[0] = new Startik(1, "Start", "Hrac dostava 25000 eur!");
		polePolicok[1] = new Nehnutelnost("", 5000, 200, null, 2, "Dunjska ulica");
		polePolicok[2] = new Nehnutelnost("", 4000, 150, null, 3, "Krizna ulica");
		polePolicok[3] = new Sanca(4, "Sanca", "Hrac si potiahne kartu sanca");
		polePolicok[4] = new Nehnutelnost("", 9000, 1000, null, 5, "Panska ulica");
		polePolicok[5] = new Nehnutelnost("", 10000, 1500, null, 6, "Bardejovska ulica");
		polePolicok[6] = new Vazenie(7, "Vazenie", "Si zadrzany");
		polePolicok[7] = new Nehnutelnost("", 3000, 100, null, 8, "Kosicka ulica");
		polePolicok[8] = new Nehnutelnost("", 8000, 1200, null, 9, "Dunajska ulica");
		polePolicok[9] = new Sanca(10, "Sanca", "Hrac si potiahne kartu sanca");
		polePolicok[10] = new Nehnutelnost("", 8000, 1700, null, 11, "Riazanska ulica");
		polePolicok[11] = new Nehnutelnost("", 6000, 700, null, 12, "Racianska ulica");
		polePolicok[12] = new Policia(13, "Policia", "Ides do vezenia");
		polePolicok[13] = new Nehnutelnost("", 7000, 900, null, 14, "Vajnorska ulica");
		polePolicok[14] = new Nehnutelnost("", 15000, 3000, null, 15, "Obchodna ulica");
		polePolicok[15] = new Sanca(16, "Sanca", "Hrac si potiahne kartu sanca");
		polePolicok[16] = new Nehnutelnost("", 11000, 1700, null, 17, "Vysoka ulica");
		polePolicok[17] = new Nehnutelnost("", 12000, 2000, null, 18, "Vajanskeho nabrezie");
		polePolicok[18] = new Dane(19, "Financna sprava", "Zaplatis dan");
		polePolicok[19] = new Nehnutelnost("", 4000, 500, null, 20, "Puchovska ulica");
		polePolicok[20] = new Nehnutelnost("", 20000, 1000, null, 21, "Rybnicna ulica");
		polePolicok[21] = new Sanca(22, "Sanca", "Hrac si potiahne kartu sanca");
		polePolicok[22] = new Nehnutelnost("", 7000, 1500, null, 23, "Kadnarova ulica");
		polePolicok[23] = new Nehnutelnost("", 4000, 350, null, 24, "Rovniankova ulica");

		
	}

	public Policko[] getPolePolicok() {
		return polePolicok;
	}

	
	public ArrayList<Karta> getSadaKariet() {
		return sadaKariet;
	}

	public ArrayList<Hrac> getSkupinaHracov() {
		return skupinaHracov;
	}

	public void pridajHraca(Hrac hrac) {
		skupinaHracov.add(hrac);
	}

	public Kocka getKocka() {
		return kocka;
	}

	public Karta PotiahniKartu() {
		if (poradieK>=sadaKariet.size()) {
			poradieK = 0;
		}
	Karta karta = sadaKariet.get(poradieK);
	poradieK++;
		return karta;
		
	}
}
