package J3_operadores;

public class operadores {
    public static void main(String[] args) {

        /*
        Operadores aritmeticos
        */
        int num1 = 5,num2 = 4;

        System.out.println("num1 + num2 = "+(num1 + num2));

        System.out.println("num1 - num2 = "+(num1-num2));
        
        System.out.println("num1 * num2 = "+(num1*num2));
    
        System.out.println("num1 / num2 = "+(num1/num2));
        float div = (float) num1 / num2;
        System.out.println(div);

        System.out.println("num1 % num2 = "+(num1%num2));
     


        /*
        Operadores de adignacion
        */        
        int i = 5;
        int j = i+4;
        //i = i + 2;
        i += 2;
        System.out.println("incremento = "+i);
        i -= 3;
        System.out.println("decremento = "+i);
        i *= j;
        System.out.println("mul = "+i);

        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombres='Andres'";
        sqlString += " and c.activo=1";
        System.out.println(sqlString);


        /*
        Operadores unarios para invertir el signo de un numero
        
        */
        int e = -5;
        
        System.out.println(+e);
        System.out.println(-e);


        /*
        Operadores post incrementales y pre incremento
        */
        System.out.println(i);
        //e = ++i;
        e = i++;
        System.out.println(e);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);

        /*
        Operadores relacionales 
        */

        i = 3;
        byte k = 7;
        float f = 127e-7f;
        double d = 2.1413e3;
        boolean B = false;

        boolean b1 = i == k;
        System.out.println("bi = i == k; "+b1);
        boolean b2 = !b1;
        System.out.println("b2 = !b1; "+b2);
        b1 = i != k;
        System.out.println("b1 = i != k; "+b1);
        b2 = B == false;
        System.out.println("b2 = B == false; "+b2);
        System.out.println("f>=d "+(f>=d));
     
        /*
        Operadores logicos 
        */
        
        boolean b3 = (f<=d) && (i!=k);
        System.out.println("b3 = (f<=d) && (i!=k); "+b3);
        boolean b4 = (f<=d) || (i==k);
        System.out.println("b4 = (f<=d) || (i==k); "+b4);
        //el codigo se resolvera de izquierda a derecha
        boolean b5 = i!=k && f<=d || i==k;
        System.out.println("b5 = (i!=k) && (f>=d) || (i==k); "+b5);
        // el and presede al or
        boolean b7 = (i!=k || f<=d) && i==k;
        System.out.println("boolean b7 = (i!=k || f<=d) && i==k; "+b7);

        boolean b8 = true||true&&false;
        System.out.println("b8 = true || true && false; "+b8);
        b8 = (true||true)&&false;
        System.out.println("b8 = (true||true)&&false; "+b8);

        /*
        Operador ternario 
        */
       String variable = 7==5 ? "si es verdadero" : "si es falso";
       System.out.println("7==5 "+(7==5)+" "+variable);

    }
}
