package liveCoding3;

import java.util.Scanner;

public class liveCoding3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        scanner.close();

        MCD calculo = new MCD();
        int mcd = calculo.calcularMCD(num1, num2);
        System.out.println("El número de cajas es " + mcd + "\nEl número de naranjas es " + num1 + "y por caja hay "
                + num1 / mcd + "\nEl número de manzanas es " + num2 + "y por caja hay " + num2 / mcd);
    }

}
