package J4_flujos_d_control;

import java.util.Scanner;

public class J1_flujos_condicionales {
    public static void main(String[] args) {
        System.out.println("Ingresa las notas para sacar tu promedio ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primera nota = ");
        int n1 = scanner.nextInt();

        System.out.println("Segunda nota = ");
        int n2 = scanner.nextInt();

        System.out.println("Tercera nota = ");
        int n3 = scanner.nextInt();

        System.out.println("Primera nota = "+n1);
        System.out.println("Segunda nota = "+n2);
        System.out.println("Tercera nota = "+n3);

        int promedio = (n1+n2+n3)/3;

        if(promedio<4){
            System.out.println("Libre...");
        }
        else if(promedio<=7){
            System.out.println("Aprobado...");
        }
        else if(promedio<=9){
            System.out.println("Regular...");
        }
        else if(promedio>=10){
            System.out.println("Sobresaliente...");
        };
        scanner.close();
         
    };
}
