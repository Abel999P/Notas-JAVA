package j2_manejo_string;

public class cadenas {
    public static void main(String[] args) {
        // los string son objeto inmutables, como todo objeto este tiene metodos y atributos
        String curso = "Programación Java";
        String curso2 = new String("programación JAVA");

        boolean esIgual = curso == curso2;
        System.out.println("es igual? con == "+esIgual );
        //
        esIgual = curso.equals(curso2);
        System.out.println("es igual? con equals "+esIgual );
        
        esIgual = curso.equalsIgnoreCase(curso2);
        // ignorar mayusculas y minusculas
        System.out.println("es igual? con equalsIgnoreCase "+esIgual );

        String profesor = " Andres Lopez";
        String detalle = curso + " con el instructor "+ profesor;
        System.out.println(detalle);
         
        byte numA = 10;
        byte numB = 5;
        //Presedencia de los valores si la primera evaluacion es string las demas seran string
        //si queremos cambiar la presedencia tenemos que usar ()
        System.out.println(detalle+" Estudiantes= "+(numA+numB));
        System.out.println((detalle+" Estudiantes= ")+numA+numB);
        
        //Metodos para concatenar string
        String detalle2 = curso.concat(" con"+profesor);
        System.out.println(detalle2);






        // Inmutabilidad su valor no se puede cambiar pero podemos copiar y crear otra instancias cambiando cosas 
        curso.concat(profesor);
        System.out.println(curso);
        String resultado = curso.concat(profesor);
        System.out.println(resultado);

        //Usando una funcion lambda
        String resultado2 = curso.transform((c)->{
            return c + " con" + profesor;
        });
        System.out.println(resultado2);
        String resultado3 = resultado.replace("a", "A");
        System.out.println(resultado3);






        //Test rendimiento concatenar con operador (+) vs método concat() vs StringBuilder
        //String Builder es el mas optimisado 
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(c);
        long inicio = System.currentTimeMillis();
        for(int i = 0 ; i<500 ; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 5 milisegundos
            //c+=a+b+"\n"; // 20 milisegundos
            sb.append(a).append(b).append("\n"); //0 ms
        };
        long fin = System.currentTimeMillis();
        System.out.println((fin-inicio)+" milisegundos");

        //Validar un Strings
        String curso3 = null;
        
        boolean esNulo = curso3 == null;
        System.out.println(esNulo);
        
        // No puedes manejar el String curso3 por que no tiene un valor 
        // System.out.prinln("Esto dara un error "+esNulo);
        if(esNulo){
            curso3 = "ingresaste un String nulo";
            System.out.println(curso3);
        };
        String curso4 = "";
        //boolean cadenaVacía = curso4.length() == 0;
        // isEmpty comprueba si la cadena esta vacia 
        //boolean cadenaVacía = curso4.isEmpty();
        // isBlank comprueba si la cadena esta vacia y si solo tiene espacio en blanco
        boolean cadenaVacía = curso4.isBlank(); 
        System.out.println(cadenaVacía);
        if(cadenaVacía){
            curso4 = "ingresaste un String vacio";
            System.out.println(curso4);

        }
        else{
            System.out.println("Perfecto puedes usar tu String");
        };







        // Métodos del objeto String 

        String nombre = "Maribel";
        // length me regresara el largo de la cadena 
        System.out.println("nombre.length() = "+nombre.length());
        // Muestra los caracteres en minusculas
        System.out.println("(nombre.toLowerCase() = "+nombre.toLowerCase());
        // Muestra los caracteres en mayusculas
        System.out.println("nombre.toUpperCase() = "+nombre.toUpperCase());
        // Compara si la cadena pasada por parametro es igual al string
        System.out.println("nombre.equals(\"Maribel\") = "+nombre.equals("Maribel"));
        System.out.println("nombre.equals(\"Lucas\") = "+nombre.equals("Lucas"));
        System.out.println("nombre.equals(\"maribel\") = "+nombre.equals("maribel"));
        System.out.println("nombre.equalsIgnoreCase(\"maribel\") = "+nombre.equalsIgnoreCase("maribel"));
        System.out.println("nombre.equals(\"Maribel\") = "+nombre.compareTo("Maribel"));
        System.out.println("nombre.charAt(0) = "+nombre.charAt(0));
        System.out.println("Sub cadena = "+nombre.substring(1,4));
        System.out.println("Sub cadena = "+nombre.charAt(1)+nombre.substring(4));
        System.out.println("Sub cadena = "+nombre.substring(nombre.length()-3));
        
        String trabalengua = "Trabalenguas";
        //retorna una nueva instancia remplazando un caracter por otro caracter
        System.out.println("trabalengua = "+trabalengua.replace("a", "@"));
        // retorna el indice da la primera aparacion de un caracter o sub cadena
        System.out.println("trabalengua.indexOf(\"a\") = "+trabalengua.indexOf("a"));
        // retorna el indice da la ultima aparacion de un caracter o sub cadena
        System.out.println("nombre.lastIndexOf(\"a\") = "+trabalengua.lastIndexOf("len"));
        // retorna un bool para saber si existe un substring dentro del string a comparar
        System.out.println("trabalengua.contains(\"len\") = "+trabalengua.contains("len"));
        // si comiensa como la sub cadena que se paso por medio de los parametros
        System.out.println("trabalengua.startsWith(\"Tra\") = "+trabalengua.startsWith("Tra"));
        // si termina como la sub cadena que se paso por medio de los parametros
        System.out.println("trabalengua.endsWith(\"Tra\") = "+trabalengua.endsWith("Tra"));
        String trabalengua2 = "  trabalengua  ";
        System.out.println(trabalengua2);
        // 
        System.out.println("trabalengua2.trim() = ");
        System.out.println(trabalengua2.trim());

        //manejo de extencion de archivos
        String archivo = "alguna_imagen.jpeg";
        System.out.println("archivo.length() = "+archivo.length());
        int indice = archivo.lastIndexOf(".");
        System.out.println(indice);
        System.out.println(archivo.substring(indice ));

        //System.out.println("trabalengua.toCharArray() = "+trabalengua.toCharArray());
        char[] arreglo = trabalengua.toCharArray();

        for (int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        };

        String[] arreglo2 = trabalengua.split("a");
        for (int i=0;i<arreglo2.length;i++){
            System.out.println(arreglo2[i]);
        };
        String[] archivoArr = archivo.split("\\.");
        for (int i=0;i<archivoArr.length;i++){
            System.out.println(archivoArr[i]);
        };                                                  
    }
}
 