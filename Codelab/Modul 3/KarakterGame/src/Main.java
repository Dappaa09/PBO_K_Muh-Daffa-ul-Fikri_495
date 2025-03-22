//Kelas utama yang merepresentasikan karakter dalam game
class KarakterGame {
    private String nama; //Atribut untuk menyimpan nama karakter
    private int kesehatan; // Atribut untuk menyimpan jumlah kesehatan karakter

    //Constructur untuk menginisialisasi objek dengan nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //Getter untuk mendapatkan nama karakter
    public String getNama() {
        return nama;
    }

    //Setter untuk mengubah nama karakter
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Getter untuk mendapatkan jumlah kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    //Setter untuk mengubah jumlah kesehatan karakter
    public void setKesehatan(int kesehatan) {
        //Menggunakan Math.max untuk memastikan kesehatan tidak berkurang dari 0
        this.kesehatan = Math.max(kesehatan, 0);
    }

    //Method untuk menyerang karakter lain
    public void serang (KarakterGame target) {
        System.out.println(this.nama + " menyerang " + target.getNama());
    }

    //Method untuk menampilkan status kesehatan karakter
    public void tampilkanStatus() {
        System.out.println(nama + " memiliki kesehatan: " + kesehatan);
    }
}

//kelas Pahlawan (subclass dari Karaktergame)
class Pahlawan extends KarakterGame {
    //Constructor untuk menginisialisasi objek Pahlawan dengan nama dan kesehatan
    public Pahlawan (String nama, int kesehatan) {
        super(nama, kesehatan); //memanggil constructor superclass
    }

    //@Override method serang() dengan serangan khusus "Orbital Strike"
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike ");
        target.setKesehatan(target.getKesehatan() - 20); //Mengurangi 20 kesehatan target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

//Kelas Musuh (subclass dari KarakterGame)
class Musuh extends KarakterGame {
    //Constructor untuk menginisialisasi objek Musuh dengan nama dan kesehatan
    public Musuh (String nama, int kesehatan) {
        super(nama, kesehatan); //memanggil constructor superclass
    }

    //@Override method serang() dengan serangan khusus "Snake Bite"
    @Override
    public void serang (KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite ");
        target.setKesehatan(target.getKesehatan() - 15); //Mengurangi 15 kesehatan target
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

//Kelas Main yang menjalankan program
public class Main {
    public static void main (String[] args) {
        //Membuat objek karakter
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan Brimstone = new Pahlawan("Brimstone", 150);
        Musuh Viper = new Musuh("Viper", 200);

        //Menampilkan status awal karakter sebelum pertempuran dimulai
        System.out.println("Status awal: ");
        Brimstone.tampilkanStatus();
        Viper.tampilkanStatus();

        //Simulasi pertarungan antara Brimstone dan Viper
        Brimstone.serang(Viper); //Brimstone menyerang viper
        Viper.serang(Brimstone); //Viper menyerang Brimstone
    }
}