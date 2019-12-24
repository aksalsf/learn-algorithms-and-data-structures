import java.util.Scanner;
public class matrixArray2D {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
	// Deklarasi Matriks A
	int i, j, k, ordo = 3;
	int[][]A = new int [ordo][ordo];
	int[][]B = new int [ordo][ordo];
	int[][]C = new int [ordo][ordo];
	int[][]D = new int [ordo][ordo];
	// Input Data
	System.out.println("Input Matriks A");
	for (i=0;i<ordo;i++ ) {
		for (j=0;j<ordo;j++ ) {
			System.out.print("A["+i+"]["+j+"] => ");
			A[i][j]=data.nextInt();data.nextLine();
		}
	}
	System.out.println("Input Matriks B");
	for (i=0;i<ordo;i++ ) {
		for (j=0;j<ordo;j++ ) {
			System.out.print("B["+i+"]["+j+"] => ");
			B[i][j]=data.nextInt();data.nextLine();
		}
	}
	// Hitung Matriks C
	for (i=0;i<ordo;i++ ) {
		for (j=0;j<ordo;j++ ) {
			C[i][j]=A[i][j]+B[i][j];
		}
	}
	for (i=0;i<ordo
		;i++ ) {
		for (j=0;j<ordo;j++ ) {
			D[i][j] = A[i][0]*B[0][j]+A[i][1]*B[1][j]+A[i][2]*B[2][j];
		}
	}	

	System.out.println("============");
	// Cetak Data
	System.out.println("Matriks A");
	for (i=0; i<ordo;i++ ) {
		for (j=0; j<ordo;j++ ) {
			System.out.print(A[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Matriks B");
	for (i=0; i<ordo;i++ ) {
		for (j=0; j<ordo;j++ ) {
			System.out.print(B[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Matriks C");
	for (i=0; i<ordo;i++ ) {
		for (j=0; j<ordo;j++ ) {
			System.out.print(C[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Matriks D");
	for (i=0; i<ordo;i++ ) {
		for (j=0; j<ordo;j++ ) {
			System.out.print(D[i][j]+" ");
		}
		System.out.println();
	}
	}
}