package teil1;

public class Testklasse {
	public static void main(String[] args) {
		RekursionTeil1 rekursionTeil1 = new RekursionTeil1();
		char test[] = {'A', 'b', 'b', 'c', 'a'};
		System.out.println(rekursionTeil1.erkennePalindromReku(test, 0));
		System.out.println(rekursionTeil1.erkennePalindromLoop(test));
	}
}
