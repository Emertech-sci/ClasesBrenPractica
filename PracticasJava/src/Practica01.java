import java.util.Scanner;

public class Practica01{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        /*
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = scanner.nextInt();
        System.out.println("Hola " + nombre + " veo que tienes " + edad + " años");

         */

        //VAmos a pedir varios valores al usuario
        /*
        System.out.println("Hola por favor dime tu ciudad favorita: ");
        String ciudad = scanner.nextLine();
        System.out.println("Cuaanto es 5 + 12: ");
        int suma = scanner.nextInt();
        System.out.println("verdad o reto: (true or false): ");
        boolean reto = scanner.nextBoolean();

        System.out.println("Tu ciudad favorita es: " + ciudad);
        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + reto);

         */

        //Crea una clase calculadora
        //SUMA
        System.out.println("Haremos una suma. Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de tu suma es: " + suma);

        //RESTA
        System.out.println("Haremos una resta. Ingresa el primer numero: ");
        int num3 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num4 = scanner.nextInt();
        int resta = num3 - num4;
        System.out.println("El resultado de tu resta es: " + resta);
    }
}
