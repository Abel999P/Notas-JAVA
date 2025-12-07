package variables_03;


public class tipos_01 {
    public static void main(String[] args){

/*
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
• Char: Para reprecentar caracteres.

• bool : Para representar true / false .
*/
        char grenA = 'G';
        boolean km = true;
        System.out.println("Caracter "+grenA);
        System.out.println("Bool "+km);
    };
};
