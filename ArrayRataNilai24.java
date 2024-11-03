import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int jumlahLulus = 0;
        int totalNilaiLulus = 0;
        int totalNilaiTidakLulus = 0;
        for (int nilai : nilaiMahasiswa) {
            if (nilai >= 70) {
                jumlahLulus++;
                totalNilaiLulus += nilai;
            } else {
                totalNilaiTidakLulus += nilai;
            }
        }

        double rataRataLulus = jumlahLulus == 0 ? 0 : (double) totalNilaiLulus / jumlahLulus;
        double rataRataTidakLulus = totalNilaiTidakLulus == 0 ? 0 : (double) totalNilaiTidakLulus / (jumlahMahasiswa - jumlahLulus);

        System.out.println("Rata-rata nilai lulus: " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataRataTidakLulus);
    }
}