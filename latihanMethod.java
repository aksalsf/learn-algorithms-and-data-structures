import java.util.Scanner;
public class latihanMethod {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int x,n;
		// Input
		System.out.println("Pangkat Biasa");
		System.out.print("Bilangan => ");
		x = data.nextInt();data.nextLine();
		System.out.print("Pangkat => ");
		n = data.nextInt();data.nextLine();
		// Hasil
		System.out.println("Hasil => " + pangkat(x,n));
		// Pangkat Array
		System.out.println("Pangkat Array");
		System.out.print("Banyak Data => ");
		int length = data.nextInt();data.nextLine();
		int [] nilai = new int[length];
		inputArray(nilai);
		garis();
		// Foreach
		for (int value : nilai) {
			System.out.println(value);
		}
		garis();
		pangkatArray(nilai,n);
		cetakPangkatArray(nilai,n);
		garis();
		// Mencari Nilai Max Array
		System.out.print(maxValue(nilai));
	}
	public static void garis() {
		System.out.println("***************************");
	}
	public static void inputArray(int [] x) {
		for (int i=0;i<x.length;i++) {
			System.out.print("Data ke-"+(i+1)+" => ");
			x[i]=data.nextInt();
		}
	}
	public static void cetakPangkatArray(int [] x, int n) {
		for (int i=0;i<x.length;i++ ) {
			System.out.println("^"+n+" => "+x[i]);
		}
	}
	// Parameter by Value
	public static int pangkat(int x, int n) {
		int hasil=1;
		for (int i=1; i<=n; i++) {
			hasil=hasil*x;
		}
		return hasil;
	}
	// Parameter by Reference
	public static void pangkatArray(int [] x, int y) {
		for (int i=0;i<x.length;i++) {
			x[i]=pangkat(x[i],y);
		}
	}
	public static int maxValue(int [] array) {
		int maksimum = array[0];
		for(int i = 0; i < array.length; i++) {
	      if (array[i] > maksimum){
	        maksimum = array[i];
	      }
	  	}
		return maksimum;
	}
}