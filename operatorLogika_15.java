import java.util.Scanner;
class OperatorBitwise(
    public static void main(String args []){

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai A");
        int a = input.nextInt();
        int b = input.nextInt();

        int hasil;

        hasil = a & b;
        System.out.println("Hasil dari a & b :" + hasil);

        hasil = a | b;
        System.out.println("Hasil dari a | b" + hasil) ;

        hasil =  a ^ b;
        System.out.println("Hasil dari a ^ b " + hasil );

        hasil = ~a;
        System.out.println ("Hasil dari a << 2 :" + hasil) ;

        hasil = a<< 2 ;
        System.out.println("Hasil dari a<<2 :" + hasil);

        hasil = b>> 2;
        System.out.println("Hasil dari b>>" + hasil);
    }
)