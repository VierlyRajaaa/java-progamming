package tugas_pratikum;

import java.util.Scanner;
public class tugas_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cetak bilangan genap dari 1 sampai N");
            System.out.println("pilih menu");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nilai N: ");
                    int n1 = input.nextInt();
                    System.out.println("Bilangan genap dari 1 sampai " + n1 + ":");
                    for (int i = 1; i <= n1; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                   case 2:
                    System.out.print("Masukkan nilai N: ");
                    int n2 = input.nextInt();
                    int jumlah = 0;
                    for (int i = 1; i <= n2; i++) {
                        jumlah += i;
                    }
                    System.out.println("Jumlah angka dari 1 sampai " + n2 + " adalah: " + jumlah);
                    break;
                case 3:
                    System.out.println(" Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (menu != 3);

        input.close();
    }
}