package teil2;

import java.util.ArrayList;
import java.util.List;

public class Einkaufsliste {
	private List<Produkt> produkte;
	private int restGeld;
	private int verfuegbar;
	
	public int getVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(int verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

	public Einkaufsliste() {
		produkte = new ArrayList<>();
	}
	
	public int kosten() {
		int kosten = 0;
		for (Produkt produkt : produkte) {
			kosten += produkt.getPreis();
		}
		return kosten;
	}
	
	public void addProdukt(Produkt produkt) {
		produkte.add(produkt);
	}

	public List<Produkt> getProdukte() {
		return produkte;
	}

	@Override
	public String toString() {
		return "Einkaufsliste [produkte=" + produkte.size() + ", restGeld=" + restGeld + ", startKapial=" + verfuegbar + "]";
	}

	public void setProdukte(List<Produkt> produkte) {
		this.produkte = produkte;
	}

	public int getRestGeld() {
		return restGeld;
	}

	public void setRestGeld(int restGeld) {
		this.restGeld = restGeld;
	}
	

}
