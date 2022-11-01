package Misc;

@metaInfo( // CUSTOM ANNOTATION
		author = "Ja", date = "2022", moraleLevel = 1)

public class Numbers {

	public static void main(String[] args) {

		float liczba1 = 1.40504497393493483789475398737593475987349857439754395749837536543573947538F;
		double liczba2 = 1.40504497393493483789475398737593475987349857439754395749837536543573947538F;
		double liczba3 = 1.40504497393493483789475398737593475987349857439754395749837536543573947538;

		int decVal = 125;
		int hexVal = 0x125;
		int binVal = 0b110110;
		int octVal = 011674;

		int underscore = 122_53;

		enum weekDay {
			PONIEDZIAŁEK, WTOREK, ŚRODA, CZWARTEK, PIĄTEK, SOBOTA, NIEDZIELA
		}
		;

		System.out.println(liczba1 + "\n" + liczba2 + "\n" + liczba3);
		System.out.println(decVal + " " + hexVal + " " + binVal + " " + octVal + " " + underscore);

		boolean warunek = true;

		int wynik = warunek ? decVal : binVal; // if-then-else

		System.out.println(wynik);

	}

}

@interface metaInfo { // CUSTOM ANNOTATION DEFINITION
	String author();

	String date();

	int moraleLevel();
}