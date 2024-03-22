
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println("Que operacion deseas realizar?");
        System.out.printf("%n1.Sumar %n2. Restar %n3. Multiplicar %n4.Dividir %n5. Salir");

        do {
            respuesta = sc.nextInt();

            System.out.println ("Ingresa tu primer numero");
            int a = sc.nextInt();
            System.out.println ("Ingresa tu segundo numero");
            int b = sc.nextInt();

           // float a = 10, b =20;

            switch (respuesta) {
                case 1:
                    System.out.println("Respuesta: ");
                    System.out.print (sumar(a, b));
                    break;
                case 2:
                    System.out.println("Respuesta: ");
                    System.out.print (restar(a, b));
                    break;
                case 3:
                    System.out.println("Respuesta: ");
                    System.out.print (multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Respuesta: ");
                    System.out.print (dividir(a, b));
                    break;

                case 5:
                    System.out.print("Saliendo");
                    break;


               default:
                    System.out.print("opcion no valida");
                    break;
            }

} while (respuesta !=5);

        }

        public static float sumar (float a, float b ) {
             return a + b;
        }
        public static float multiplicar (float a, float b ){
        return a * b;
        }
        public static float dividir (float a, float b) {
        return a / b;

    }
        public static float restar (float a, float b) {
        return a - b;
    }





    }

