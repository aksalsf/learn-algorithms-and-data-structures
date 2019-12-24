import java.util.Scanner;
public class cariData {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi Variabel
		int n;
		// Input
		System.out.print("Masukkan Banyak Data => ");
		n=data.nextInt();data.nextLine();
		String [] names = new String[n];
		inputArray(names);
		// Aksi
		actionMenu(names);
	}
	public static void actionMenu(String [] array) {
		System.out.println("Pilih Aksi");
		System.out.println("1. Cetak Data");
		System.out.println("2. Cari Data");
		System.out.println("3. Keluar");
		System.out.print("=> ");
		int does = data.nextInt();data.nextLine();
		action(does,array);
	}
	public static void inputArray(String [] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print("Data ke-"+(i+1)+" => ");
			array[i]=data.nextLine();
		}
	}
	public static void action(int var, String [] array) {
		switch (var) {
			case 1:
				printArray(array);
				garis();
				actionMenu(array);
				break;
			case 2:
				System.out.print("Keyword => ");
				String keyword = data.nextLine();
				findData(array,keyword);
				garis();
				actionMenu(array);
				break;
			default:
				break;
		}
	}
	public static void printArray(String [] array){
		for (String value : array) {
			System.out.println(value);
		}
	}
	public static void findData(String [] array, String keyword){
		for (int i=0;i<array.length;i++) {
			if (array[i].contains(keyword)) {
				System.out.println("Data ditemukan!");
				System.out.println("Indeks ke-"+i+" => "+array[i]);
			}
		}
	}
	public static void garis() {
		System.out.println("============");
	}
}