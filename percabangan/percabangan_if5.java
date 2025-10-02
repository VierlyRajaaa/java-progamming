package percabangan;
import java.util.Scanner;
public class percabangan_if5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Inputkan angka hari :");
        int angkahari = input.nextInt();

        switch (angkahari){
            case 1:
            System.out.println("Hari Minggu");
            // hari minggu
            break;
            case 2:
            System.out.println("Hari Senin");
            // hari senin
            break;
            case 3:
            System.out.println("Hari Selasa");
            // hari selasa
            break;
            case 4:
            System.out.println("Hari Rabu");
            // hari rabu
            break;
            case 5:
            System.out.println("Hari Kamis");
            //hari kamis
            break;
            case 6:
            System.out.println("Hari Jum\'at");
            // hari jum'at
            break;
            case 7:
            System.out.println("Hari Sabtu");
            //hari sabtu
            break;
            default:
              System.out.println("angka yang anda inputkan tidak tersedia");

        }
    }
    
}
