package J4_flujos_d_control;

public class J3_switch1 {
    public static void main(String[] args) {

        /*
         * Tipos de valores que switch puede usar
         * La variable o expresión que pasas al switch (el "selector") puede ser de los
         * siguientes tipos:
         * 
         * Tipos primitivos enteros: byte, short, char, int.
         * Clases envolventes (Wrapper classes): Byte, Short, Character, Integer.
         * String: Cadenas de texto (desde Java 7).
         * Tipos enumerados (enum): Ideales para un conjunto fijo de constantes.
         * 
         * Importante: switch no funciona con long, float, double ni boolean.
        */

        int dia = 3;
        String tipoDia;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipoDia = "Día laborable";
                break; // Necesario para salir del switch
            case 6:
            case 7:
                tipoDia = "Fin de semana";
                break;
            default:
                tipoDia = "Día inválido";
                break;
        }
        System.out.println(tipoDia);

        
        
        
        
        tipoDia = switch (dia) { // Asignación directa a la variable
            case 1, 2, 3, 4, 5 -> "Día laborable";
            case 6, 7 -> "Fin de semana";
            default -> "Día inválido";
        };
        System.out.println(tipoDia);





        tipoDia = switch (dia) {
            case 1, 2, 3, 4, 5 -> "Día laborable";
            case 6, 7 -> {
                // Bloque de código más complejo
                String mensaje = "Es fin de semana y hace sol";
                yield mensaje; // Devuelve el valor del bloque
            }
            default -> "Día inválido";
        };
        System.out.println(tipoDia);





        Object obj = "Hola Mundo";

        String resultado = switch (obj) {
            case String s -> "Es una cadena de longitud: " + s.length();
            case Integer i -> "Es un número entero: " + i;
            case null -> "Es nulo"; // Manejo de null directamente
            default -> "Es otro tipo de objeto";
        };
        System.out.println(resultado);



    }
}
