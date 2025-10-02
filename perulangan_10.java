import java.util.Scanner;
public class perulangan_10 {
    public static void  main (String[]args){
        Scanner input = new Scanner (System.in);
        String jawabanUser = "";

        while (!jawabanUser.equalsIgnoreCase("ya")){
            System.out.println("Apakah anda yakin inginkeluar ? jawab (ya/tidak): ");
            jawabanUser = input.nextLine();
        }
    }
    
}
