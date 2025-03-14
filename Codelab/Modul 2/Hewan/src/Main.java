class Hewan {
    String nama;
    String jenis;
    String suara;

    // Konstruktor untuk inisialisasi atribut
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("NAMA: " + nama);
        System.out.println("JENIS: " + jenis);
        System.out.println("SUARA: " + suara);
        System.out.println(); // Baris kosong untuk pemisah
    }

    // Metode main ditambahkan di dalam kelas Hewan
    public static void main(String[] args) {
        // Membuat objek hewan1
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        // Memanggil metode tampilkanInfo() dari kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}