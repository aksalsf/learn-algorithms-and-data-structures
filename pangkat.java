import java.util.Scanner;
public class pangkat {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
    // Deklarasi Variabel
    int i, bilangan, pangkat, hasil;
    // Input
    System.out.print("Bilangan => ");
    bilangan = data.nextInt();data.nextLine();
    System.out.print("Pangkat => ");
    pangkat = data.nextInt();data.nextLine();
    // Proses
    hasil = 1;
    for(i=1; i<=pangkat; i++){
        hasil = hasil * bilangan;
    }
    System.out.print(hasil);
    }
}