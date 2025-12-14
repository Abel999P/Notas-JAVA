package J4_flujos_d_control;

import java.util.Scanner;

public class J4_flujo_for {
    public static void main(String[] args) {

        int variable = 5;
        for(int i=1;i<=variable;i++){
            System.out.println(i);
        };
        
        for(int i=1,j=10 ; i<j ; i++,j--){
            System.out.println(i+" - "+j);
        };

        for(int i=0; i<=10 ;i++){            
            if(i%2==0){
                continue;
            }
            System.out.println("impares - "+i);
        };


        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Pato","Luz","Lucas"};

        for(int i = 0; i<nombres.length ; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].toLowerCase().contains("Paco".toLowerCase())){
                    continue;
            };
            System.out.println(i+" -"+nombres[i]);
        };


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el usuario a encontrar ");
        String buscar = scanner.nextLine();
        int indice = 0;
        boolean encontrado = false;
        for(int i=0; i<nombres.length; i++){
            if(buscar.toLowerCase().contains(nombres[i].toLowerCase())){
                encontrado = true;
                indice = i;
                break;
            };
        };

        if(encontrado){
            System.out.println("Usuario - "+nombres[indice]+" -Encontrado");
        }else{
            System.out.println("Usuario - "+buscar+" -No Encontrado");
        }
        scanner.close();

    };
}

