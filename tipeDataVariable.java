class tipeDataVariable {
	public static void main(String[] args) {
		// Deklarasi variable
		String nama;
		int lahir, umur;
		// Inisialisasi nilai variable
		nama = "Paijo";
		lahir = 2000;
		umur = 2019 - lahir;
		// Deklarasi + Inisialisasi
		double tinggi = 165;
		char gender = 'L';
		boolean aktif = true;

		// Cetak
		System.out.println("Nama saya " + nama);
		System.out.println("Saya lahir tahun " + lahir + ", umur saya " + umur);
		System.out.println("Tinggi saya " + tinggi);
		System.out.println("Jenis kelamin saya " + gender);
		System.out.println("Aktif = " + aktif);
		System.out.println("Tahun 2012, usia saya " + (2012 - lahir));
	}
}