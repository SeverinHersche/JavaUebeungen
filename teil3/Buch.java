package teil3;

import java.time.LocalDate;

public class Buch implements Comparable<Buch>{
	private String titel;
	private String autor;
	private int anzSeiten;
	private LocalDate erscheinungsjahr;

	@Override
	public int compareTo(Buch buch) {
        int sComp = this.autor.compareTo(buch.autor);
        
        if (sComp != 0) {
           return sComp;
        } 

        return erscheinungsjahr.compareTo(buch.erscheinungsjahr) * -1;
	}

	public Buch(String titel, String autor, int anzSeiten, LocalDate erscheinungsjahr) {
		super();
		this.titel = titel;
		this.autor = autor;
		this.anzSeiten = anzSeiten;
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnzSeiten() {
		return anzSeiten;
	}

	public void setAnzSeiten(int anzSeiten) {
		this.anzSeiten = anzSeiten;
	}

	public LocalDate getErscheinungsjahr() {
		return erscheinungsjahr;
	}

	public void setErscheinungsjahr(LocalDate erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	@Override
	public String toString() {
		return "Buch [titel=" + titel + ", autor=" + autor + ", anzSeiten=" + anzSeiten + ", erscheinungsjahr="
				+ erscheinungsjahr + "]";
	}

}
