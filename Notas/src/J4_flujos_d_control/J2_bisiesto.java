package J4_flujos_d_control;

import java.util.Scanner;

public class J2_bisiesto {
    /*
     * Año bisiesto
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Año bisiesto");
        System.out.println("Ingrese el mes (N°) ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año (YYYY)");
        int ano = scanner.nextInt();
        int numeroDias = 0;
        if (mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (ano % 400 == 0 || ((ano % 4 == 0) && !(ano % 100 == 0))) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }

        System.out.println("Numero de dias del mes = " + numeroDias);
        scanner.close();

    }
}
