import java.util.Scanner;
public class faktorial {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    // Deklarasi
    int bilangan, total;
    // Input
    System.out.print("Faktorial => ");
    bilangan = data.nextInt();data.nextLine();
    // Start
    total = 0;
    for (int i=bilangan; i>=1; i--){
        total = total + i;
    }
    System.out.print("Total => " + total);
    }
}