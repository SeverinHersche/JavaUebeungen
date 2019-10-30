package teil2;

import java.util.ArrayList;
import java.util.List;

public class Greedy {
	Einkaufsliste greedy(Produkt[] produkte, int geld) {
		int g = geld;
		Einkaufsliste einkaufsliste = new Einkaufsliste();
		boolean ausgegeben = false;
		List<Produkt> produktes = convertArrayToList(produkte);

		while (!ausgegeben) {
			Produkt teuerstes = new Produkt(0, "");
			for (Produkt produkt : produktes) {
				if (produkt.costsMore(teuerstes)) {
					if (g >= produkt.getPreis()) {
						teuerstes = produkt;
						ausgegeben = false;
					} else {
						ausgegeben = true;
					}
				}
			}
			if (teuerstes.getPreis() != 0) {
				g -= teuerstes.getPreis();
				produktes.remove(teuerstes);
				einkaufsliste.addProdukt(teuerstes);
				if(produktes.size() == 0) {
					ausgegeben = true;
				}
			}
		}
		einkaufsliste.getProdukte().forEach(System.out::println);
		einkaufsliste.setRestGeld(g);
		einkaufsliste.setVerfuegbar(geld);
		return einkaufsliste;
	}

	public static <T> List<T> convertArrayToList(T array[]) {
		List<T> list = new ArrayList<>();

		for (T t : array) {
			list.add(t);
		}
		return list;
	}
}
