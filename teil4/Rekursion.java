package teil4;

public class Rekursion {
	int berechnen(int a, int b, int c, int result) {
		if (a != 0) {
			result = berechnen(a - 1, b, c, result + 1);
		}
		else if (b != 0) {
			result = berechnen(a, b - 1, c, result + 1);
		}
		else if (c != 0) {
			result = berechnen(a, b, c - 1, result + 1);
		}
		
		return result;
	}
}
