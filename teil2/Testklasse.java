package teil2;



public class Testklasse {
	public static void main(String[] args) {
		Greedy greedy = new Greedy();
		Produkt[] podukte = new Produkt[7];
		podukte[0] = new Produkt(100, "SA");
		podukte[1] = new Produkt(90, "SA");
		podukte[2] = new Produkt(10, "SA");
		podukte[3] = new Produkt(7, "SA");
		podukte[4] = new Produkt(4, "SA");
		podukte[5] = new Produkt(109, "SA");
		podukte[6] = new Produkt(20, "SA");
		Einkaufsliste einkaufsliste = greedy.greedy(podukte, 500);
		System.out.println(einkaufsliste);
	}
}
