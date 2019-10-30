package teil3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testklasse {
	public static void main(String[] args) {
		List<Buch> buecher = new ArrayList<>();
		buecher.add(new Buch("1", "Severin", 10, LocalDate.now()));
		buecher.add(new Buch("2", "l", 10, LocalDate.of(2019, 4, 6)));
		buecher.add(new Buch("3", "Severin", 10, LocalDate.of(2019, 3, 6)));
		buecher.add(new Buch("4", "o", 10, LocalDate.of(2019, 4, 7)));
		buecher.add(new Buch("5", "o", 10, LocalDate.of(2019, 4, 9)));
		buecher.add(new Buch("6", "l", 10, LocalDate.of(2019, 2, 6)));
		buecher.add(new Buch("a7sd", "o", 10, LocalDate.of(2019, 4, 10)));
		Collections.sort(buecher);
		buecher.forEach(System.out::println);
	}
}
