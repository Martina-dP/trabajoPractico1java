import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
      /*  int start = 0;
        do {
            start++;
            System.out.println(start);
        } while (start < 10);
        System.out.println("Ready or not,  here I come! ");

        int num ;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduce un número entero");
            if (input.hasNextInt()){
                num = input.nextInt();
                input.nextLine();
                if (num>0){
                    System.out.println("El número es positivo");
                }else if (num<0){
                    System.out.println("El número es negativo");
                }else{
                    System.out.println("El número es 0");
                }
            }else{
                System.out.println("Error. Debes introducir un entero");
                input.nextLine();
            }
        } while (!input.hasNextInt());*/
        int num ;
        int totalDigitos = 0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        do {

            if (input.hasNextInt()){
                num = input.nextInt();
                input.nextLine();
                if (num > 0){
                    int temp = num;

                    while (temp > 0) {
                        temp /= 10;
                        totalDigitos++;
                    }
                    System.out.println("Tiene" + " " + totalDigitos + " " + "digitos");
                }else{
                    System.out.println("El número tiene que ser positivo");
                }
            }else{
                System.out.println("Error. Debes introducir un entero y positivo");
                input.nextLine();
            }
        } while (!input.hasNextInt());
    }
}
