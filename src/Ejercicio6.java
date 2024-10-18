import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num ;
        int inverso = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your custom countdown");

        if (input.hasNextInt() ) {
            num = input.nextInt();

            if (num >= 0) {
                do {
                    int result = num % 10;
                    inverso = inverso * 10 + result;
                    num = num/10;

                } while (num > 0);
                System.out.println("El inverso es" + " " +inverso);
            } else {
                System.out.println("Debes introducir un valor mayor o igual a 0");
            }
        } else {
            System.out.println("Error: No ingresaste un número entero.");
        }
    }
}