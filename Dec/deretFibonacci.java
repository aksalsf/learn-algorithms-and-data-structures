import java.util.Scanner;
public class deretFibonacci {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int n;
		// Input
		System.out.print("Nilai n => ");
		n = data.nextInt();data.nextLine();
		// Hasil
		System.out.println("Hasil => " + fibo(n));
	}
	public static int fibo(int n) {
		int hasil=0;
		if (n==0 || n==1) {
			return n;
		} else {
			hasil=fibo(n-1)+fibo(n-2);
		}
		return hasil;
	}
}