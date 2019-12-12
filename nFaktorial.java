import java.util.Scanner;
public class nFaktorial {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int bilangan;
		// Input
		System.out.println("Aplikasi Bilangan Faktorial");
		System.out.print("Faktorial => ");
		bilangan = data.nextInt(); data.nextLine();
		// Hasil
		System.out.println("=> " + faktorial(bilangan));
	}
	public static int faktorial(int bilangan) {
	    int total = 1;
	    for (int i=bilangan; i>=1; i--){
	    	System.out.print(i + " ");
	        total=total*i;
	    }
	    return total;
	}
}