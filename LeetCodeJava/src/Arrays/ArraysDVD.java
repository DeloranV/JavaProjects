package Arrays;

class DVD {

	public String title;
	public int year;
	public String type;

	DVD(String title, int year, String type) {
		this.title = title;
		this.year = year;
		this.type = type;
	}

	static void output(DVD[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(
					"Tytuł: " + tablica[i].title + "     Rok: " + tablica[i].year + "     Gatunek: " + tablica[i].type);
		}
	}

}

public class ArraysDVD {

	public static void main(String[] args) {

		DVD dvdarray[] = new DVD[2];

		dvdarray[0] = new DVD("Ja", 2005, "Akcja");
		dvdarray[1] = new DVD("Ty", 2006, "gówno");

		DVD.output(dvdarray);

	}

}
