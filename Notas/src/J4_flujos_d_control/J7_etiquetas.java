package J4_flujos_d_control;

import java.util.Scanner;

public class J7_etiquetas {
    public static void main(String[] args) {
        bucle1:
        for (int i = 0; i < 5; i++) {

            bucle2:
            for(int j = 0;j<5;j++){
                if  (i == 2) {
                    continue bucle2;
                };
                System.out.print("-"+j);
            };

            System.out.println("    i = " + i);
        };
    
        etiqueta1:
        for(int i=1;i<=7;i++){
            int j = 1;
            etiqueta2:
            while (j<=8) {
                if(i==6 || i==7){
                    i++;
                    System.out.println("[- Dia de descanso ! - ]");
                    continue etiqueta2;
                }
                System.out.print("-"+j+"-");
                j++;
            }

            System.out.println(" Registro de Horas trabajadas    -Dia "+i);
        };

        String frace = "tres tristes tigres tragan trigo en tres trigal";

        System.out.print("Ingrese una palabra a encontrar :");
        int cantidad = 0;
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        scanner.close();
        buscar:
        for(int i=0;i<frace.length();i++){
            int k = i;    
            for(int j=0;j<palabra.length();j++){
                if(frace.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                };
            }
            cantidad++;
        };
    
        System.out.println("Se encontro ("+cantidad+") coincidencias"+" de la palabra "+palabra);
    }
}

