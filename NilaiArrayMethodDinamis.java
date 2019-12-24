import java.util.Scanner;
public class NilaiArrayMethodDinamis {
static Scanner input = new Scanner(System.in);

public static void main(String[] arguments){   	
	int i;
	int jml=100;
	int [] nilaiMath=new int[jml];
	int [] nilaiAlgo=new int[jml];
	String [] nama=new String [jml];
	nama[0]="AA";
	nama[1]="BB";
	nilaiMath[0]=3;
	nilaiMath[1]=4;
	nilaiAlgo[0]=1;
	nilaiAlgo[1]=2;
	int jmlsiswa=2;
	int pilih=0;
	while(pilih!=6)
	{ 
      System.out.println("1.Masukkan Data Siswa");
	  System.out.println("2.Cetak Nilai Matematika");
	  System.out.println("3.Cetak Nilai Algoritma");
	  System.out.println("4.Hitung Rata Nilai Matematika");
	  System.out.println("5.Hitung Rata Nilai Algo");
	  System.out.println("6.Keluar");
	  System.out.print("Masukkan Pilihan Anda:");
	  pilih = input.nextInt();input.nextLine();
	  System.out.println("----------------------------------------");
	    switch(pilih)
	    {case 1: 
		System.out.println("Masukkan Data");
	    jmlsiswa=tambahData(nama,nilaiMath,nilaiAlgo,jmlsiswa);
		System.out.println("----------------------------------------");
		break;
		case 2: 
		System.out.println("Cetak Nilai Matematika");
	    cetakNilai(nama,nilaiMath,jmlsiswa);
		System.out.println("----------------------------------------");
		break;
		case 3: 
		System.out.println("Cetak Nilai Algoritma");
	    cetakNilai(nama,nilaiAlgo,jmlsiswa);
		System.out.println("----------------------------------------");
		break;
		case 4: 
		System.out.println("Hitung Rata Nilai Matematika");
	    System.out.println("Rata Nilai Matematika :"+hitungRataMapel(nilaiMath,jmlsiswa));
		System.out.println("----------------------------------------");
		break;
		case 5: 
		System.out.println("Hitung Rata Nilai Algoritma");
	    System.out.println("Rata Nilai Algoritma :"+hitungRataMapel(nilaiAlgo,jmlsiswa));
		System.out.println("----------------------------------------");
		break;
		case 6: 
		System.out.println("Keluar Program");
		System.out.println("----------------------------------------");
	    break;
		default: 
		System.out.println("Pilihan Salah");
		System.out.println("----------------------------------------");
		}
	}
	
}//end main
public static int tambahData(String [] nama,int [] nilai1,int [] nilai2,int jmlsiswa )
{
	    
		System.out.print("Masukkan Nama Siswa Ke-"+(jmlsiswa+1)+":");
	    nama[jmlsiswa] = input.nextLine();
		System.out.print("Masukkan Matematika Siswa Ke-"+(jmlsiswa+1)+":");
	    nilai1[jmlsiswa] = input.nextInt();input.nextLine();
		System.out.print("Masukkan Algoritma Siswa Ke-"+(jmlsiswa+1)+":");
	    nilai2[jmlsiswa] = input.nextInt();input.nextLine();
		jmlsiswa++;
		return jmlsiswa;
	
}



public static double hitungRataMapel(int [] Nilai, int jmlsiswa)
{
int total=0; 
	for(int i=0;i<jmlsiswa;i++) 
	{
		total=total+Nilai[i];
	}
	double rata;
	rata=(double)total/jmlsiswa;
	return rata;
}

public static void cetakNilai(String [] nama ,int [] Nilai, int jmlsiswa)
{
for(int i=0;i<jmlsiswa;i++) 
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+":"+nama[i]);
		System.out.println("Nilai Siswa Ke-"+(i+1)+":"+Nilai[i]);
	} 
}

public static void cetakNilai(String [] nama ,double [] Nilai,int jmlsiswa)
{
for(int i=0;i<jmlsiswa;i++) 
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+":"+nama[i]);
		System.out.println("Nilai Siswa Ke-"+(i+1)+":"+Nilai[i]);
	} 
}
}//end class