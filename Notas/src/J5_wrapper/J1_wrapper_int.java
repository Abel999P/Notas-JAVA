package J5_wrapper;

public class J1_wrapper_int {
    public static void main(String[] args) {
        
        int intPrimitivo = 32768;
        //Integer intObjeto1 = new Integer(3);
        //Integer intObjeto2 = 32768;


        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo; 
        
        System.out.println("intObjeto = "+intObjeto);
        int num = intObjeto;
        System.out.println("num = "+num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = "+num2);

        String valorTVlcd =  "67000";
        Integer valor = Integer.valueOf(valorTVlcd);

        // Segun los bytes que soporte tendra perdida de informacion
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = "+shortObjeto);
        
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = "+byteObjeto);
    }
}
