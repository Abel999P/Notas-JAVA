package J5_wrapper;

public class J4_wrapper_bool {
    public static void main(String[] args) {
        Integer num1,num2 ;

        num1 = 1;
        num2 = 2;
        
        boolean primBool = num1 > num2;

        Boolean objetoBoolean = Boolean.valueOf(primBool);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("Valor Primitivo = "+primBool);
        System.out.println("objetoBoolean = "+objetoBoolean);
        System.out.println("objetoBoolean2 = "+objetoBoolean2);
    
        
        System.out.println("comparando dos objetos boolean = "+(objetoBoolean==objetoBoolean2));
        System.out.println("comparando dos objetos boolean = "+(objetoBoolean.equals(objetoBoolean2)));
        System.out.println("comparando objeto1 y objeto3 boolean = "+(objetoBoolean==objetoBoolean3));
        System.out.println("comparando objeto2 y objeto3 boolean = "+(objetoBoolean2.equals(objetoBoolean3)));
    
        // retornamos un valor primitivo de objetoBoolean2 usando el metodo booleanValue  
        boolean primitivoBool2 = objetoBoolean2.booleanValue();
        System.out.println("Valor Primitivo 2 =  "+primitivoBool2);
    
    }
}
