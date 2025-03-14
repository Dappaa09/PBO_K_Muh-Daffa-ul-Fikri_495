import java.time.LocalDate;
import java.util.Scanner;

public class dataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        scanner.close();

        String jenisKelaminString = getJenisKelaminString(jenisKelamin);
        int umur = hitungUmur(tahunLahir);

        System.out.println("\nData Diri:");
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminString);
        System.out.println("Umur  : " + umur + " tahun");
    }

    private static String getJenisKelaminString(char jenisKelamin) {
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            return "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            return "Perempuan";
        }
        return "Jenis kelamin tidak valid";
    }

    private static int hitungUmur(int tahunLahir) {
        int tahunSekarang = LocalDate.now().getYear();
        return tahunSekarang - tahunLahir;
    }
}