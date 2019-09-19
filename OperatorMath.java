import java.util.Scanner;
public class OperatorMath {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Deklarasi variable
	int x, y, result;
	double result2;
	// Program starts
	System.out.println("Kalkulator Sederhana x dan y");
	// Input nilai x dan y
	System.out.print("Nilai x => ");
	x = data.nextInt(); data.nextLine();

	System.out.print("Nilai y => ");
	y = data.nextInt(); data.nextLine();

	result = x + y;
	System.out.println("x + y = " + result);
	
	result = x - y;
	System.out.println("x - y = "+ result);
	
	result = x % y;
	System.out.println("x % y = "+ result);
	
	result = x * y;
	System.out.println("x * y = "+ result);
	
	result2 = (double)x / y;
	System.out.println("x / y = " + result2);
}
}