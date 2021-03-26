package Monopol;

public class Tester {
	public static void main(String[] args) {
		Hrac hrac = new Hrac("Matus", "x_x");
		
//		Nehnutelnost nehnutelnost = new Nehnutelnost("", 2000, 200, null, 2, "Racianska ulica");
//		Startik start = new Startik(1, "Start", "Hrac obdrzi 20000");
		Format format = new Format();
	 	Karta karta = new KartaDarcek("Musis zaplatit pokutu 5000$!");		
		format.karta(karta);

	}

}
