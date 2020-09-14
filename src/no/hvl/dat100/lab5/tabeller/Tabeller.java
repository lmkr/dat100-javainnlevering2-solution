package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		System.out.print("[");

		for (int tall : tabell) {

			System.out.print(tall + " ");
		}

		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String str = "[";

		for (int i = 0; i < tabell.length; i++) {

			str = str + tabell[i];

			// sett kun komma om der er fler element igjen
			if (i < tabell.length - 1) {
				str = str + ",";
			}

		}

		str = str + "]";

		return str;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;

		for (int tall : tabell) {
			sum = sum + tall;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean funnet = false;
		int i = 0;

		while (i < tabell.length && (!funnet)) {

			if (tabell[i] == tall) {
				funnet = true;

			}

			i++;
		}

		return funnet;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int posisjon = -1;
		int i = 0;

		while (i < tabell.length && (posisjon == -1)) {

			if (tabell[i] == tall) {
				posisjon = i;

			}

			i++;
		}

		return posisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int lengde = tabell.length;
		int[] nytabell = new int[lengde];

		for (int i = 0; i < lengde; i++) {
			nytabell[i] = tabell[lengde-1-i];
		}

		return nytabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		int lengde = tabell.length;
		boolean sortert = true;

		int i = 0;
		while ((i < lengde - 1) && sortert) {

			if (!(tabell[i] <= tabell[i + 1])) {
				sortert = false;
			}
			i++;
		}

		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;

		int[] nytabell = new int[lengde1 + lengde2];

		for (int i = 0; i < lengde1; i++) {
			nytabell[i] = tabell1[i];
		}

		for (int i = 0; i < lengde2; i++) {
			nytabell[lengde1 + i] = tabell2[i];
		}

		return nytabell;

	}
}
