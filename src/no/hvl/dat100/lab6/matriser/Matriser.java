package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String str = "";
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				str = str + matrise[i][j] + " ";
			}
			
			str = str + "\n";
		}
		
		return str;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int m = matrise.length;
		int n = matrise[0].length;
		
		int[][] nymatrise = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nymatrise[i][j] = tall * matrise[i][j];

			}
		}
		
		return nymatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		boolean like = true;
		
		if ((a.length != b.length) || (a[0].length != b[0].length)) {
			return false;
		}
		
		int m = a.length;
		int n = a[0].length;
		
		for (int i = 0; i < m && like; i++) {
			for (int j = 0; j < n && like; j++) {
				if (a[i][j] != b[i][j]) {
					like = false;
				}

			}

		}
		return like;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		int m = matrise.length;
		int[][] speiletmatrice = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				speiletmatrice[j][i] = matrise[i][j];
			}
		}

		return speiletmatrice;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		int m = a.length;
		int n = b[0].length;
		
		int l = a[0].length;
		
		int[][] c = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				for (int k = 0; k < l; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
	
			}
		}

		return c;
	
	}
}
