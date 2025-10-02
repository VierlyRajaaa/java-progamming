import java.util.Scanner;
public class OperatorLogika_13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Berikut ini manakah  yang termasuk jenis operator di dala pemograman java?");
        System.out.println("A. Operator Indosat");
        System.out.println("B. Operator Aritmatika");
        System.out.println("C. Operator Telkomsel");
        System.out,println("D. Operator Assignment");
        System.out.print ("Jawaban Anda");

        char jawaban = (input.next()). charAt(0); // charAt() untuk mengkonversi dari string ke char

        boolean cekjawaban = ( jawaban == 'B') || (jawaban == ' D');
        System.out.println("Hasil jawaban:" + cekjawaban);

    }

     
}
