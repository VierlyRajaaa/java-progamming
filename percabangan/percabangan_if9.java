package percabangan;
import java.util.Scanner;

public class percabangan_if9{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka1 = 0, angka2 = 0;

        System.err.println("pilihan menu");
        System.err.println("!. Penentuan angka Terbesar");
        System.err.println("2.penentuan angka ganjil dan genap");
        System.err.println("Masukkan pilihan Anda");
        int pilihanmenu = input.nextInt();

        switch(pilihanmenu){
            case 1:
            System.out.println("Inputkan Angka pertama : ");
            // untuik menginputkan angka pertama
            angka1 = input.nextInt();

            System.err.println("Inputkan Angka Kedua:");
            // untuk menginputkan angka kedua
            angka2 = input.nextInt();
            if(angka1> angka2 ) {
           System.err.println("Angka Pertama :" + angka1 + "lebih besar dari angka kedua");
           // untuk menjumlahkan angka pertama hasilnya lebih besar dari angka kedua
            } else {
                System.err.println("Angka Kedua lebih besar dari angka pertama");
                // untuk menjumlahkan angka kedua hasilnya lebih besar dari angka pertama
            }
            break;
            case2:
           System.err.println("Inputkan angka pertama :");
           //untuk menginputkan angka pertama
            angka1 =input.nextInt();
       
            System.err.println("inputkan Angka Kedua :");
            // untuk menginputkan angka keduaa
            angka2 = input.nextInt();

            if (angka1 % 2 == 0){
                System.err.println("Angka Pertama: " + angka1 + " adalah BILANGAN GENAP");
                // untuk menjumlahkan angka pertama adalah bilangan genap
               System.err.println("Angka Pertama: " + angka1 + " adalah BILANGAN GANJIL");
               // untuk menjumlahkan angka pertama adalah bilangan ganjil
            }
            if(angka2 % 2 ==0){
                System.err.println("Angka kedua " + angka2 + " adalah BILANGAN GENAP");
                // untuk menjumlahkan angka kedua adalah bilangan genap
                System.err.println("Angka kedua: " + angka2 + " adalah BILANGAN GANJIL");
                // untuk menjumlahkan angka kedua adalah bilangan ganjil
                {
                    break;

                default:
                    System.err.println("Pilihan Anda Tidak TersediA");
                }
        
            }
        }
    }
}    