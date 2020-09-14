package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static String tilStreng(int[][] matrise) {

		String str = "";
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				str = str + matrise[i][j] + " ";
			}
			
			str = str + "\n";
		}
		
		return str;
		
	}

	public static int[][] skaler(int tall, int[][] matrise) {
		
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

	public static int[][] speile(int[][] matrise) {

		int m = matrise.length;
		int[][] nymatrise = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				nymatrise[j][i] = matrise[i][j];
			}
		}

		return nymatrise;
	
	}

	public static int[][] multipliser(int[][] a, int[][] b) {

		int m = a.length;
		int n = b.length;
		
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

	public static boolean erLik(int[][] mat1, int[][] mat2) {

		boolean like = true;
		
		int m = mat1.length;
		int n = mat2.length;
		
		for (int i = 0; i < m && like; i++) {
			for (int j = 0; j < n && like; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					like = false;
				}

			}

		}
		return like;
	}
}
