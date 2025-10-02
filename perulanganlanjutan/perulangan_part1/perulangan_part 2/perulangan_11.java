package perulanganlanjutan.perulangan_part1;

public class perulangan_11{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("input:");
        int n = input.nextInt();

        System.out.println("Output:");
        for (int i = 1; i <= n; i++){
            if (i == 1 || i == n || j == 1 || j == n || i== j ){
                System.out.print(" *");

            } else {
                System.out.println();
            }
        }
    }

    
}
