package J4_flujos_d_control;

public class J6_foreach {
    public static void main(String[] args) {
        
        int[] numImpares ={1,3,5,7,9,11,13,15};
//      FOREACH
        for(int num: numImpares){
            System.out.println("numeros = "+num);
        };
        
        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Pato","Luz","Lucas"};
        
        for(String nombre : nombres){
            System.out.println("Usuario: "+nombre);
        };
    
    }
}
