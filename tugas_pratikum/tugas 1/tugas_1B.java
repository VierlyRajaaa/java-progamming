package tugas_pratikum;

import java.util.Scanner;

public class tugas_1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("Masukkan Batas Bawah: ");
        int batasbawah = input.nextInt();
        System.out.println("Masukkan Batas Atas: ");
        int batasAtas = input.nextInt();
        System.out.println("\n deret Fibonacci dari" + batasbawah + "sampai" + batasAtas + " :");
        while (a <= batasAtas){
           if (a >== batasBawah ){
            System.err.print(a + " ");
         }
         int c = a + b;
         a= b;
         b = c;
    }
    
}
}