

import java.io.Console;

public class tugas_03 {
    public static void main(String[] args) {
        Console input = System.console();

        System.out.print("Inputkan jenis kelamin: ");
        String kelamin = input.readLine();

        System.out.print("Inputkan Nomor Sepatu: ");
        int sepatu = Integer.parseInt(input.readLine());

        System.out.print("Input Apakah Sudah Menikah: ");
        boolean menikah = Boolean.parseBoolean(input.readLine());

        System.out.println("Jenis Kelamin: " + kelamin);
        System.out.println("Nomor Sepatu: " + sepatu);
        System.out.println("Sudah Menikah: " + menikah);
    }
}