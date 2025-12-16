package J5_wrapper;

public class J3_operadores_relacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);

        // Compara si son de la misma instancia al ser objetos
        // pero si fueran primitivos compara por valor 
        System.out.println("Son el mismo objeto? = "+(num1==num2));
    
        num2 = 1000;
        System.out.println("-----------------------------------------------------------");
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);

        System.out.println("Son el mismo objeto? = "+(num1==num2));
        // comparamos el valor del objeto con el metodo equals
        System.out.println("tienen elmismo valor? = "+(num1.equals(num2))); 
        // retornamos el valor primitivo con el metodo intValue para compararlo
        System.out.println("tienen elmismo valor? = "+(num1.intValue()==num2.intValue()));
        
        num2 = 2000;
        boolean condicion = num1 > num2 ;
        System.out.println("condicion = "+condicion);

    }
}
