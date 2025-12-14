package J4_flujos_d_control;

public class J5_flujo_while {
    public static void main(String[] args) {
        int i = 0;

        while(i<5){
            System.out.println("i = "+i);
            i++;
        };

        i = 0;
        boolean prueba = true;
        while (prueba) {
            if(i==7){
                prueba = false;
            }
            System.out.println("(2)-i = "+i);
            i++;
        };

        prueba = false;
        do{
            System.out.println("Esto almenos se ejecutara una vez apesar que la condicion sea (false)");
        }while(prueba);
    
    }
}