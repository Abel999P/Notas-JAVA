package J6_valor_vs_referencia;

public class J1_pasarXvalor {
    // Las clases wrapper son imutables asi que cuando queremos cambiar el valor creamos otra instancia 
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("iniciamos el metodo main con i = "+i);
        test(i);
        System.out.println("Finaliza el metodo main con i = "+i);
 
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el metodo test  con i = "+i);
        i =  35;
        System.out.println("Finaliza el metodo test con i = "+i);
    }

}