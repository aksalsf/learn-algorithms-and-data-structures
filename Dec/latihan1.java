import java.util.ArrayList;
import java.util.Scanner;
public class latihan1 {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		// Deklarasi
		ArrayList<String> names = new ArrayList<>();
		names.add("aqil");
		names.add("burhan");
		names.add("candra");
		// Aksi
		actionMenu(names);
	}
	public static void actionMenu(ArrayList<String> array) {
		System.out.println("Selamat Datang di Program ArrayList");
		System.out.println("1. Input Data");
		System.out.println("2. Cetak Data");
		System.out.println("3. Cari Data");
		System.out.println("4. Ubah Data");
		System.out.println("5. Hapus Data");
		System.out.println("6. Keluar");
		System.out.print("=> ");
		int does = data.nextInt();data.nextLine();
		action(does, array);
	}
	public static void action(int does, ArrayList<String> array) {
		switch (does) {
			case 1:
				inputData(array);
				garis();
				actionMenu(array);
				break;
			case 2:
				printData(array);
				garis();
				actionMenu(array);
				break;
			case 3:
				findData(array);
				garis();
				actionMenu(array);
				break;
			case 4:
				updateData(array);
				garis();
				actionMenu(array);
				break;
			case 5:
				deleteData(array);
				garis();
				actionMenu(array);
				break;
			default:
				break;
		}
	}
	public static void inputData(ArrayList<String> array) {
		String tempData;
		char does;
		// Input Data
		do {
			System.out.print("Masukkan Nama => ");
			tempData = data.nextLine();
			array.add(tempData);
			System.out.println("Lagi? (y/n)");
			System.out.print("=> ");
			does = data.next().charAt(0);data.nextLine();
		} while (does=='y' || does=='Y');
	}
	public static void printData(ArrayList<String> array) {
		for (String data : array) {
				System.out.println(data);
			}
	}
	public static void findData(ArrayList<String> array){
		System.out.print("Keyword => ");
		String keyword = data.nextLine();
		for (String data : array) {
			if (data.contains(keyword)) {
				int index = array.indexOf(data);
				System.out.println("Data ditemukan!");
				System.out.println("Indeks ke-"+index+" => "+data);
			}
		}
	}
	public static void updateData(ArrayList<String> array) {
		char does;
		String tempData;
		do {
			System.out.print("Data yang mau diganti => ");
			String keyword = data.nextLine();
			for (int i=0;i<array.size();i++) {
				if (array.get(i).contains(keyword)) {
					int index = array.indexOf(array.get(i));
					System.out.println("Data ditemukan!");
					System.out.println("Indeks ke-"+index+" => "+array.get(i));
					System.out.print("Ganti => ");
					tempData = data.nextLine();
					array.set(index, tempData);
				}
			}
			System.out.println("Ganti lagi? (y/n)");
			System.out.print("=> ");
			does = data.next().charAt(0);data.nextLine();
		} while (does=='y' || does=='Y');
	}
	public static void deleteData(ArrayList<String> array) {
		char does;
		do {
			System.out.print("Data yang mau dihapus => ");
			String keyword = data.nextLine();
			for (int i=0;i<array.size();i++) {
				if (array.get(i).contains(keyword)) {
					int index = array.indexOf(array.get(i));
					System.out.println("Hapus "+array.get(i)+" (y/n)?");
					System.out.print("=> ");
					does = data.next().charAt(0);data.nextLine();		
					if (does=='y' || does=='Y') {
						array.remove(index);
					}
				}
			}
			System.out.println("Hapus lagi? (y/n)");
			System.out.print("=> ");
			does = data.next().charAt(0);data.nextLine();
		} while (does=='y' || does=='Y');
	}
	public static void garis() {
		System.out.println("============");
	}
}