import java.util.Scanner;
public class methodDeretFibonacci {
	static Scanner data = new Scanner (System.in);
	public static void main(String[] args) {
        System.out.print("Masukan Jumlah Deret Fibonacci => ");
        int n = data.nextInt();
        System.out.print(fibo(n));
    }
    public static int fibo(int n) {
    	int hasil=0;
    	int deret[] = new int[n];
        if (n==0) {
        	return n;	
        } else if (n==1 || n==2) {
        	hasil=1;
        } else {
	        deret[0] = 1;
	        deret[1] = 1;
	        for(int i = 2; i < n; i++) {
	            deret[i] = deret[i-1] + deret[i-2];
	            hasil = deret[i];
	        }
        }
        return hasil;
    }
}