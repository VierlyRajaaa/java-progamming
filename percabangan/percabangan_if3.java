package percabangan;

import java.util.Scanner;

public class percabangan_if3 {
    public static void main(String[] args) {
        // untuk memainkan run java
        Scanner input = new Scanner (System.in);
        // untuk mendeklarasikan data tersebut

        System.out.print("Inputkan score angka : ");
        //untuk menginput java
        int score = input.nextInt();
        //untuk mendeklarasikan  int score
        String nilaihuruf;
        //string untuk menggunakan data khusus

        if (score >= 80 && score <= 100){
            // untuk menjumlahkan score tersebut
            nilaihuruf = "A";
            //hasil menjumlahkan score
        }else if (score >= 71 && score <= 80){
            // untuk mendeklarasikan score
            nilaihuruf = "B";
            // untuk mendeklarasikan hasil yang di hitung
        } else if (score >= 51 && score <=70){
            // score menginput dataa
            nilaihuruf = "C";
            } else if (score >= 21 && score <=50){
                nilaihuruf = "E";
            }else {
                nilaihuruf = "E";

        System.out.println("Nilainya adalah" + nilaihuruf);
        //untuk mendeklarasikan menampilkan teks dan nilai
    }
}
}