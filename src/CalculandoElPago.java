import java.util.Scanner;

public class CalculandoElPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese el valor del primer producto: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el valor del segundo producto: ");
        int valor2 = scanner.nextInt();

        System.out.println("Ingrese el valor del tercer producto: ");
        int valor3 = scanner.nextInt();

        System.out.println("Ingrese el valor del cuarto producto: ");
        int valor4 = scanner.nextInt();

        System.out.println("Ingrese el valor del quinto producto: ");
        int valor5 = scanner.nextInt();

        int valortotal = valor1 + valor2 + valor3 + valor4 + valor5;

        System.out.println("\n" + name + ", el valor total de su compra es: " + valortotal);

        //Evaluando el tipo de pago
        if (valortotal <= 10000) {
            System.out.println("El pago será en efectivo.");
        } else if (valortotal <= 20000) {
            System.out.println("El pago será con tarjeta.");
        } else {
            System.out.println("El pago será con cheque.");
        }

        scanner.close();

    }
}
