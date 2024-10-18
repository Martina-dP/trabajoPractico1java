import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int num ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your custom countdown");

        if (input.hasNextInt() ) {
            num = input.nextInt();
            if (num >= 1) {
                for (int i = 1 ; i <= 10; i++) {
                    System.out.println(num * i);
                }
            } else {
                System.out.println("Error: El numero tiene que ser mayor a 1");
            }
        } else {
            System.out.println("Error: No ingresaste un número entero.");
        }
    }
}
