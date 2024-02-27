import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tuliskan nama anda: ");
        String nama = scanner.nextLine();

        System.out.print("Pilih jenis kelamin anda (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";

        System.out.print("Isilah tanggal lahir anda (thn-bln-tgl): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggalHariIni = LocalDate.now();
        Period umur = Period.between(tanggalLahir, tanggalHariIni);
        int tahunUmur = umur.getYears();
        int bulanUmur = umur.getMonths();
        System.out.println("\nInfo pribadi:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + tahunUmur + " tahun " + bulanUmur + " bulan");
    }
}
