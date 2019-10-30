package teil2;

public class Produkt {
	private int preis;
	private String name;

	public Produkt(int preis, String name) {
		super();
		this.preis = preis;
		this.name = name;
	}

	public Produkt() {

	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + preis;
		return result;
	}

	@Override
	public String toString() {
		return "Produkte [preis=" + preis + ", name=" + name + "]";
	}

	public boolean costsMore(Produkt produkt) {
		if(this.getPreis() > produkt.getPreis()) {
			return true;
		}
		return false;
	}

}
