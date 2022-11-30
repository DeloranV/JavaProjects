package DS;
import java.util.Scanner;

class Input {
	static String keyboardInput() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("--->");

		String word = keyboard.next();
		
		return word;
		
	}
}

class Arrays {

	static char[] createArray(String content) {
		char[] wordArray = new char[content.length()];

		for (int i = 0; i < content.length(); i++)
			wordArray[i] = content.charAt(i);

		return wordArray;
	}

	static char[][] createVinArray() {
		char[][] vinArray = new char[26][26];
		int znak = (int) '`';

		for (int i = 0; i < vinArray.length; i++) {
			znak++;
			for (int j = 0; j < vinArray[i].length; j++) {
				if (znak > 122) {
					vinArray[i][j] = (char) ((int) znak - 26);
					znak++;
				} else {
					vinArray[i][j] = (char) znak;
					znak++;
				}
			}
			znak -= 26;
		}
		// ArrayDisplay(vinArray);
		return vinArray;
	}

	static void ArrayDisplay(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	static void ArrayDisplay(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
		}
	}

}

class Cipher {
	private static String word = Input.keyboardInput();
	private static String keyword = Input.keyboardInput();
	private static char[] wordArray = Arrays.createArray(word);
	private static char[] keywordArray = Arrays.createArray(keyword);
	private static char[][] vinArray = Arrays.createVinArray();
	private static char[] encrypted = new char[word.length()];

	static void encryption() {
		
		int j = -1;
		for (int i = 0; i < wordArray.length; i++) {
			j++;
			if (j >= keywordArray.length)
				j = 0;
			encrypted[i] = vinArray[((int) wordArray[i]) - 97][(int) keywordArray[j] - 97];
		}
		Arrays.ArrayDisplay(encrypted);
	}

}

public class Vigenere {

	public static void main(String[] args) {
		
		System.out.println("Podaj słowo do zaszyfrowania, następnie wpisz słowo kluczowe");
		Cipher.encryption();

	}

}
