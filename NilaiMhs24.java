import java.util.Scanner;

public class NilaiMhs24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahNilai = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }

        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        double rataRata = total / jumlahNilai;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\n--- Hasil ---");
        System.out.println("Nilai mahasiswa yang dimasukkan: ");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println();
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
