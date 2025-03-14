// Kelas RekeningBank
class RekeningBank {
    // Atribut
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Method untuk setor uang
    public void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Method untuk tarik uang
    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("20231070311129", "Maharani", 500000);
        RekeningBank rekening2 = new RekeningBank("20231070311307", "Amelia", 1000000);

        // Menampilkan informasi rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Transaksi setor uang
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        System.out.println();

        // Transaksi tarik uang
        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        System.out.println();

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}