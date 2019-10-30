package teil1;

public class RekursionTeil1 {
	boolean erkennePalindromReku(char[] daten, int index) {
		if(index >= daten.length / 2) {
			return true;
		}
		if(Character.toLowerCase(daten[index]) == Character.toLowerCase(daten[(daten.length - 1) - index])) {
			return erkennePalindromReku(daten, index + 1);
		}else {
			return false;
		}
	}
	
	boolean erkennePalindromLoop(char[] daten) {
		for (int i = 0; i < daten.length; i++) {
			if(i >= daten.length / 2) {
				return true;
			}
			if(Character.toLowerCase(daten[i]) != Character.toLowerCase(daten[(daten.length - 1) - i])) {
				return false;
			}
		}
		return false;
	}
}
