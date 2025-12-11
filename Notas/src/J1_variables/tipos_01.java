package J1_variables;

import java.util.ArrayList;

import java.util.Scanner;

public class tipos_01 {
    public static void main(String[] args){

/*

        Existen dos categorias de datos principales primitivos/referencia

        Los tipos primitivos contienen un solo valor e incluyen enteros ,flotantes, caracteres , boolean etc ...
        Son tipos de datos escalares que contienen un solo valor y staticos es decir ,se define el tipo de dato
        de la variable a la hora de definir esta

        Los tipos referencia contienen objetos como string ,listas ,clases etc ...
        
        Nombres de variables

        • Por convención, los nombres de las variables empiezan con
        una letra minúscula
        • Debe ser un juego de caracteres comprendido en la
        codificación Unicode
        • No puede ser el mismo que una palabra clave (reservadas del
        lenguaje) o el nombre de un valor booleano (true or false)
        • No deben tener el mismo nombre que otras variables cuyas
        declaraciones aparezcan en el mismo ámbito.
        • Si una variable está compuesta de más de una palabra, como
        'nombreDato' las palabras se ponen juntas y cada palabra
        después de la primera empieza con una letra mayúscula.
        • Pueden comenzar por una letra, un subrayado o un símbolo
        de dólar, siendo los siguientes caracteres letras o dígitos.



• Enteros

• Int: 4 bytes de espacio para almacenamiento. Desde -2,147,483,648 hasta 2,147,483,647
• Short: 2 bytes de espacio para almacenamiento. Desde -32,768 hasta 32,767
• Long: 8 bytes de espacio para almacenamiento. Una barbaridad. Sufijo L
• Byte: 1 byte de espacio para almacenamiento. Desde -128 hasta 127.
*/
        int num = 2147483647;
        short num1 = 32767;
        byte num2 = 127;

        System.out.println("• Int: 4 bytes de espacio para almacenamiento. Desde -"+num+" hasta "+num);
        System.out.println("• Short: 2 bytes de espacio para almacenamiento. Desde -"+num1+" hasta "+num1);
        System.out.println("• Byte: 1 byte de espacio para almacenamiento. Desde -"+num2+" hasta "+num2);
    

/*
• Coma flotante (decimales)

• Float: 4 bytes de espacio para almacenamiento. Aproximadamente 6 a 7 cifras decimales significativas. Sufijo F.
• Double: 8 bytes de espacio para almacenamiento. Aproximadamente 15 cifras decimales significativas.
*/
        float decimal = 1.234567F;
        double decimal2 = 2.123453212345329;
        System.out.println("• Float: 4 bytes de espacio para almacenamiento. Aproximadamente 6 a 7 cifras decimales significativas. Sufijo F.\nEjemplo: " + decimal);    
        System.out.println("• Double: 8 bytes de espacio para almacenamiento. Aproximadamente 15 cifras decimales significativas.\nEjemplo: " + decimal2);

/* 
• Char: Para reprecentar caracteres siempre con comillas simples '' .
        Este ocupa 2 byte y usa el código UNICODE por ejemplo para acceder a la letra c 
                char c = '\u0021';


• bool : Para representar true / false ocupa 1 byte.
*/
        char grenA = 'G';
        boolean km = true;
        System.out.println("Caracter "+grenA);
        System.out.println("Bool "+km);

/*
        Inferencia de tipos
• ¿Qué es la inferencia de tipos?
• Es una característica de algunos lenguajes de
programación que permite al compilador deducir
automáticamente el tipo de una variable en función
del valor que se le asigna, sin que el programador
tenga que especificarlo explícitamente.
• El compilador analiza el valor asignado y deduce el
tipo más adecuado.
*/
       // Inferencia de tipo para un entero (int)
        var numero = 10;
        // En tiempo de compilación, 'numero' es un 'int'.
        // En tiempo de ejecución, los primitivos como 'int' no tienen un objeto de clase,
        // pero podemos ver que se comporta como tal.

        // Inferencia de tipo para una cadena de texto (String)
        var texto = "Hola Mundo";
        // En tiempo de compilación, 'texto' es un 'String'.

        // Inferencia de tipo para un ArrayList (List<String>)
        var lista = new ArrayList<String>();
        lista.add("Elemento 1");
        // En tiempo de compilación, 'lista' es un 'ArrayList<String>', que es un subtipo de 'List<String>'.

        // Inferencia de tipo para un tipo no primitivo
        float precio = 19.99f;
        // En tiempo de compilación, 'precio' es un 'double'.

        // Imprimir los valores y sus tipos reales en tiempo de ejecución (para objetos)
        System.out.println("Variable 'numero': Valor = " + numero);
        // Para tipos primitivos, Java no permite llamar a getClass() directamente.
        System.out.println("Variable 'texto': Valor = " + texto + ", Tipo: " + texto.getClass().getName());
        System.out.println("Variable 'lista': Valor = " + lista + ", Tipo: " + lista.getClass().getName());
        System.out.println("Variable 'precio': Valor = " + precio+", Tipo: "+((Object) precio).getClass().getName());

/*
        Converción 
Sistemas númericos: decimal, binario, octal y hexadecima
*/
        Scanner scanner = new Scanner(System.in); 
        int numeroDecimal = scanner.nextInt();
        scanner.close();
        // Distintas maneras de ingresar 500 
        System.out.println("numeroDecimal = "+numeroDecimal);
        System.out.println("numero binario de "+numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = "+numeroBinario);
        System.out.println("numero octal de "+numeroBinario+" = "+Integer.toOctalString(numeroBinario));
        
        int numeroOctal = 0764;
        System.out.println("numerOctal = "+numeroOctal);
        System.out.println("numero hexadecimal de "+numeroOctal+" = "+Integer.toHexString(numeroOctal));

        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = "+numeroHexadecimal);

// Convertir de tipos de datos

        
    };
};
