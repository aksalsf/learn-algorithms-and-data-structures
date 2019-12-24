import java.util.Scanner;
public class konversiSuhu {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variabel
	double suhuAwal, suhuKonversi;
	String suhu;
	// Input
	System.out.print("Suhu (Celcius) => ");
	suhuAwal = data.nextDouble(); data.nextLine();
	System.out.print("Konversi ke (Reamur/Fahrenheit/Kelvin) => ");
	suhu = data.nextLine();
	// Proses
	switch (suhu) {
		case "Reamur": suhuKonversi = (4 * suhuAwal) / 5  ; break;
		case "Fahrenheit": suhuKonversi = ((9 * suhuAwal) / 5) + 32; break;
		case "Kelvin": suhuKonversi = suhuAwal + 273; break;
		default: suhuKonversi = suhuAwal;
	}
	if (suhuKonversi == suhuAwal) {
		System.out.println("Anda mungkin salah mengetikkan jenis suhu konversi");
	} else {
		System.out.println("Hasil Konversi => " + suhuKonversi + " derajat " + suhu);	
	}
	}
}