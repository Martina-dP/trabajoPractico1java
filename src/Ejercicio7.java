import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        double millas = 0;
        double km = 0;
        boolean exit = false;
        Scanner input = new Scanner(System.in);

            do {
                System.out.println("Enter your custom millas");
                if (input.hasNextDouble()) {
                    millas = input.nextDouble();
                    exit = millas>=0;
                }
                input.nextLine();
            } while (!exit);
                km = millas * 1.61;
                System.out.println("Tu convercion en km es:" + " " + km);

    }
}
