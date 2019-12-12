import java.util.Scanner; 
public class BubbleSort3	 
{   static Scanner data = new Scanner (System.in);
	public static void main(String[] arg) 
	{ 
		System.out.print("Banyak data  :"); 
		int n = data.nextInt(); data.nextLine();
		int [] nilai = new int [n]; 
		//bagian input//
		inputdata(nilai);
		//cetak data sebelum di sort
		cetakdata(nilai);	
		//proses sorting
		Buble(nilai);
		//cetak hasil sorting
		System.out.println("Sesudah di Sort");
		cetakdata(nilai);		 
	}
	
	
	
	
	
	
	
	
	
	
	// Deklarasi Method
	public static void inputdata(int [] nilai){
	for(int i=0;i<nilai.length;i++)
		{
		System.out.print("Masukan nilai  ke-"+(i+1)+":"); 
		nilai[i] = data.nextInt();data.nextLine();
		}
	}	
	
	public static void cetakdata(int [] nilai)
	{ 
	    for(int i=0;i<nilai.length;i++)
		{
	    System.out.print(nilai[i]+", ");
	    }
		System.out.println();
	}
	
	
	public static void tukardata(int [] nilai,int n, int m)
	{ int temp;
	  temp=nilai[n];
	  nilai[n]=nilai[m];
	  nilai[m]=temp;
	}
	
	public static void Buble(int [] nilai)
	{ 
	  for(int i=0;i<nilai.length;i++)
		 {  
		   for(int j=nilai.length-1;j>=i+1;j--)
		   {  
		     if(nilai[j]<nilai[j-1])
			 {tukardata(nilai,j,j-1);}
             cetakdata(nilai);			 
		   }
            	   
		 }
	
	}
} 
