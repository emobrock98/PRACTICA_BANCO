import java.util.Hashtable;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("***************************");
            System.out.println("--  WELCOME TO CAIXABANK --");
            System.out.println("***************************");
            System.out.println("INTROCUCE LA OPCION DESEADA");
            System.out.println("1. Crear cuenta con saldo");
            System.out.println("2. Sacar dinero ");
            System.out.println("3. Meter dinero");
            System.out.println("4. Ver saldo");
            System.out.println("5. Salir");
            System.out.println("***************************");
            System.out.println("INTRODUCE LA OPCION DESEADA");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("SALIENDO...");
                    break;

            }
        } while (opcion != 5);
    }
}
