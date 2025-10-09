package tugas_pratikum;

public class tugas_1A {
    public static void main(String[] args) {
        
        int a = 0, b = 1;
        System.out.print("Deret Fibonacci (0 - 100): ");
        
        while (b <= 100) {
            System.out.print(b + " ");
            int c  = a + b;
            a = b;
            a = c;
        }
    }
}
    
    

