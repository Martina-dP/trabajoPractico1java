import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        double num = 0;
        boolean salir = false;
        final int LIMIT = 5;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < LIMIT; i++) {
            do {
                System.out.print("Ingrese un numero: ");
                if (input.hasNextDouble()) {
                    num = input.nextDouble();
                    salir = true;
                }
                input.nextLine();
            } while (!salir); {
                System.out.println("Su cuadrado es: "+Math.pow(num,2));
            }
        }
        System.out.println("Error: No ingresaste un número entero.");
    }
}
