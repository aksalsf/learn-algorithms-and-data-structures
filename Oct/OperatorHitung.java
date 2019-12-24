import java.util.Scanner;
public class OperatorHitung {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
		int x, y, jumlah, kurang, kali, modulo;
		double bagi;
		// Input
		System.out.println("Operator Hitung");
		System.out.print("Nilai x -> ");
		x = data.nextInt();data.nextLine();
		System.out.print("Nilai y -> ");
		y = data.nextInt();data.nextLine();
		// Proses
		jumlah = x + y;
		kurang = x - y;
		kali = x * y;
		modulo = x % y;
		bagi = x/y;
		// Output
		System.out.println(x + "+" + y + "=" + jumlah);
		System.out.println(x + "-" + y + "=" + kurang);
		System.out.println(x + "*" + y + "=" + kali);
		System.out.println(x + "%" + y + "=" + modulo);
		System.out.println(x + "/" + y + "=" + bagi);

		// Inrement
		System.out.println("A. Nilai x adalah -> " + x);
		System.out.println("B. Nilai x adalah -> " + (x++)); // Cetak dulu, baru dijumlahkan 1 => 4 => 4+ 1 = 5
		System.out.println("C. Nilai x adalah -> " + (++x)); // Jumlah dulu, baru dicetak => 5 + 1 = 6
		System.out.println("D. Nilai x adalah -> " + x);
		x++;
		System.out.println("E. Nilai x adalah -> " + x);
		++x;
		System.out.println("F. Nilai x adalah -> " + x);
		x+=2;
		System.out.println("G. Nilai x adalah -> " + x);
		System.out.println("H. Nilai x adalah -> " + (x+=3));
		System.out.println("I. Nilai x adalah -> " + (x-=1));
		System.out.println("J. Nilai x adalah -> " + (x*=2));
		System.out.println("K. Nilai x adalah -> " + (x%=3));
	}
}