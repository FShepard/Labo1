import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("Qué operación deseas realizar?");
            System.out.printf("%n1. Sumar %n2. Restar %n3. Multiplicar %n4. Dividir %n5. Salir%n");

            respuesta = sc.nextInt();

            if (respuesta == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Ingresa tu primer número");
            float a = sc.nextFloat();
            System.out.println("Ingresa tu segundo número");
            float b = sc.nextFloat();

            switch (respuesta) {
                case 1:
                    System.out.println("Respuesta: " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("Respuesta: " + restar(a, b));
                    break;
                case 3:
                    System.out.println("Respuesta: " + multiplicar(a, b));
                    break;
                case 4:
                    try {
                        float resultado = dividir(a, b);
                        System.out.println("Respuesta: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: División por cero");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (respuesta != 5);

    }

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }

    public static float restar(float a, float b) {
        return a - b;
    }
}
