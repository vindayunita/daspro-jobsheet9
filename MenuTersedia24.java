import java.util.Scanner;

public class MenuTersedia24 {
    public static void main(String[] args) {

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin Anda cari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia.");
        } else {
            System.out.println("Maaf, makanan " + makananDicari + " tidak ada di menu.");
        }
    }
}