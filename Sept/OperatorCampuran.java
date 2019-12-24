import java.util.Scanner;
public class OperatorCampuran {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] abc) {
	// Variable
	int z;
	// Starts
	System.out.println("Operator Campuran");
	System.out.print("Nilai z => ");
	z = data.nextInt(); data.nextLine();
	int y = z;

	z+=4;
	System.out.println(y + " + 4 = " + z);

	z-=4;
	System.out.println(y + " - 4 = " + z);

	z*=4;
	System.out.println(y + " * 4 = " + z);


}
}