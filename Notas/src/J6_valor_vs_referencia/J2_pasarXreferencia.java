package J6_valor_vs_referencia;

public class J2_pasarXreferencia {
    // Cuando pasamos por referencia usamos el mismo objeto por que las dos intancias estan apuntando al mismo espacio en memoria
    public static void main(String[] args) {
        int[] edad = { 10, 11, 12 };
        System.out.println("Iniciamos el metodo main con edad = " + edad);
        System.out.print("[");
        for (int i : edad) {
            System.out.print("(" + i + "),");
        }
        System.out.print("]");

        System.out.println();
        System.out.println("Antes de llamar al metodo test");
        test(edad);
        System.out.println("Despues de llamar al metodo test donde modificamos los valors dentro de la referencia");

        System.out.println("Finaliza el metodo main con el valor de edad =");
        System.out.print("[");
        for (int i : edad) {
            System.out.print("(" + i + "),");
        }
        System.out.print("]");

    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el metodo test con edad = " + edadArr);
        System.out.print("[");
        for (int i =0; i<edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        };
        System.out.print("]");
        System.out.println();
    }

}
