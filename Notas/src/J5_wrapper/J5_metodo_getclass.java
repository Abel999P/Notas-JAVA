package J5_wrapper;

import java.lang.reflect.Method;

public class J5_metodo_getclass {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        Class strClase = texto.getClass();
        System.out.println(texto.getClass());
        System.out.println(strClase.getName());
        System.out.println(strClase.getSimpleName());
        System.out.println(strClase.getPackageName());

        System.out.println("---------------------------------------------------");
        for(Method metodo: strClase.getMethods()){
            System.out.println("Metodo = "+metodo.getName());
        };

        Integer num = 54;

        Class intClase = num.getClass();
        System.out.println("intClase = "+intClase);
        System.out.println("intClase = "+intClase.getName());
        System.out.println("intClase = "+intClase.getSimpleName());
        System.out.println("---------------------------------------------------");
        Class objetoClase = intClase.getSuperclass().getSuperclass();
        System.out.println("intClase.getSuperclass().getSuperclass(); = "+intClase.getSuperclass());
        System.out.println("intClase.getSuperclass().getSuperclass(); = "+objetoClase);

        System.out.println("---------------------------------------------------");
        for(Method metodo: objetoClase.getMethods()){
            System.out.println("Object Metodo = "+metodo.getName());
        };
    }
}
