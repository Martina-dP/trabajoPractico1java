import java.util.Scanner;

public class Practicas {
    public static void main(String[] args) {

        int numero ;
        int totalDigitos;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your custom countdown:  ");

        if (input.hasNextInt() ) {
            numero = input.nextInt();
            if (numero >= 0) {
                totalDigitos = numero/10;
                while (numero > 0) {
                    numero--;
                }
                System.out.println("Tiene " + totalDigitos + " dígitos");
            } else {
                System.out.println("Error: El número debe ser mayor a 1.");
            }
        } else {
            System.out.println("Error: No ingresaste un número entero.");
        }

    int numero1 = 0;
        while (numero1 < 10){
            numero1++;
            System.out.println(numero1);
        }
        System.out.println("Ready or not,  here I come! ");

        int numero2 = 10;
        while (numero2 > 1){
            numero2--;
            System.out.println(numero2);
        }
        System.out.println("Blast off! ");

        int numero3 ;

        System.out.println("Enter your custom countdown:  ");

        if (input.hasNextInt() ) {
            numero3 = input.nextInt();
            if (numero3 > 1) {
                while (numero3 >= 1) {
                    numero3--;
                    System.out.println(numero3);
                }
                System.out.println("Blast off! ");
            } else {
                System.out.println("Error: El número debe ser mayor a 1.");
            }
        } else {
            System.out.println("Error: No ingresaste un número entero.");
        }

    }
}



