package percabangan;

import java.io.*;

public class percabangan_if4 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Merknya apa:");
        String merk = input.readLine();
        //untuk menyimpan data

        int ukuran =0;
        // untuk mengukurr ukuran
        int harga = 0;
        // untuk mengukur harga

        if (merk.equals("ABC"));
            System.out.println("Ukuranya apa:");
            ukuran = Integer.parseInt(input.readLine());

            if (ukuran >= 26 && ukuran <=30){
                harga =160000;
                // harga 160000
            }else if(ukuran >= 31 && ukuran <= 34){
                harga = 1800000;
                // harga 180000
            }
            System.out.println("Merk:" + merk);
            System.out.println("Ukuran :" + ukuran);
            System.err.println("Harga: Rp ." + harga);
        }
    }
