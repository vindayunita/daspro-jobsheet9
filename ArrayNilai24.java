import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println("Hasil dan Status Kelulusan:");
        for (int i = 0; i < 10; i++) {
            String status = (nilaiAkhir[i] >= 60) ? "Lulus" : "Tidak Lulus";
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i] + " - " + status);
        }

        sc.close();
    }
}