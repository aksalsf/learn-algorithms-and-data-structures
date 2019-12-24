import java.util.Scanner;
public class NilaiArrayMethod {
static Scanner input = new Scanner(System.in);

public static void inputNilai(int [] Nilai)
{
for(int i=0;i<Nilai.length;i++) 
	{
		System.out.print("Masukkan Nilai Siswa Ke-"+(i+1)+":");
	    Nilai[i] = input.nextInt();
	}
}

public static double hitungRataMapel(int [] Nilai)
{
int total=0; 
	for(int i=0;i<Nilai.length;i++) 
	{
		total=total+Nilai[i];
	}
	double rata;
	rata=(double)total/Nilai.length;
	return rata;
}

public static void cetakNilai(String [] nama ,int [] Nilai)
{
for(int i=0;i<Nilai.length;i++) 
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+":"+nama[i]);
		System.out.println("Nilai Siswa Ke-"+(i+1)+":"+Nilai[i]);
	} 
}

public static void cetakNilai(String [] nama ,double [] Nilai)
{
for(int i=0;i<Nilai.length;i++) 
	{
		System.out.println("Nama Siswa Ke-"+(i+1)+":"+nama[i]);
		System.out.println("Nilai Siswa Ke-"+(i+1)+":"+Nilai[i]);
	} 
}

public static void main(String[] arguments){   	
	int i;
	int jml=3;
	int [] nilaiMath=new int[jml];
	int [] nilaiAlgo=new int[jml];
	String [] nama={"AA","BB","CC"};
	int pilih=0;
	while(pilih!=7)
	{
	  System.out.println("1.Masukkan Nilai Matematika");
	  System.out.println("2.Masukkan Nilai Algoritma");
	  System.out.println("3.Cetak Nilai Matematika");
	  System.out.println("4.Cetak Nilai Algoritma");
	  System.out.println("5.Hitung Rata Nilai Matematika");
	  System.out.println("6.Hitung Rata Nilai Algo");
	  System.out.println("7.Keluar");
	  System.out.print("Masukkan Pilihan Anda:");
	  pilih = input.nextInt();
	    switch(pilih)
	    {case 1: 
		System.out.println("Masukkan Nilai Matematika");
	    inputNilai(nilaiMath);break;
		case 2: 
		System.out.println("Masukkan Nilai Algoritma");
	    inputNilai(nilaiAlgo);break;
		case 3: 
		System.out.println("Cetak Nilai Matematika");
	    cetakNilai(nama,nilaiMath);break;
		case 4: 
		System.out.println("Cetak Nilai Algoritma");
	    cetakNilai(nama,nilaiAlgo);break;
		case 5: 
		System.out.println("Hitung Rata Nilai Matematika");
	    System.out.println("Rata Nilai Matematika :"+hitungRataMapel(nilaiMath));
		break;
		case 6: 
		System.out.println("Hitung Rata Nilai Algoritma");
	    System.out.println("Rata Nilai Algoritma :"+hitungRataMapel(nilaiAlgo));
		case 7: 
		System.out.println("Keluar Program");
	    break;
		default: 
		System.out.println("Pilihan Salah");
		}
	}
	/*
	//bagian inputan
	System.out.println("Masukkan Nilai Matematika");
	inputNilai(nilaiMath);
	System.out.println("Masukkan Nilai Algoritma");
	inputNilai(nilaiAlgo);
	
	//bagian proses / hitung
	double rataMath=hitungRataMapel(nilaiMath);
	double rataAlgo=hitungRataMapel(nilaiAlgo);

	double [] rataIndividu=new double[jml];
	for(i=0;i<jml;i++) 
	{

		rataIndividu[i]=(double)(nilaiMath[i]+nilaiAlgo[i])/2;
	}

    //bagian output	
	System.out.println("Cetak Nilai Matematika");
	cetakNilai(nama,nilaiMath);
	System.out.println("Cetak Nilai Algoritma");
	cetakNilai(nama,nilaiAlgo);
	System.out.println("Cetak Nilai Rata Individu");
	cetakNilai(nama,rataIndividu);
	
	System.out.println("------------------------------------");
	System.out.println("Rata-rata Kelas Matematika:"+rataMath);
	System.out.println("Rata-rata Kelas Algoritma:"+rataAlgo);
	//1.tambahkan dan cetak nilai algoritma untuk semua siswa
	//2.tentukan rata2 kelas nilai matematika dan algoritma
	//3.tentukan rata2 nilai tiap siswa dari 2 makul 
	*/
}//end main
}//end class