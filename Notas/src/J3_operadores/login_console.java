package J3_operadores;

import java.util.Scanner;

public class login_console {
    public static void main(String[] args) {
        //
//        String user = "andres";
//        String password = "12345";
//        String user2 = "Lucas";
//        String password2 = "54321";
//        String[] usersName = new String[2];
//        String[] passwords = new String[2];
//        usersName[0]=user;
//        passwords[0]=password;
//        usersName[1]=user2;
//        passwords[1]=password2;

        String[] usersName = {"andres","Lucas","Pepe"};
        String[] passwords = {"123","12345","54321"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Login--");
        String inputUser = scanner.next();
        String inputPassword = scanner.next();

        for(int i=0;i<usersName.length;i++){
            if(usersName[i].equals(inputUser) && passwords[i].equals(inputPassword)){
                System.out.println("Acceso consedido");
                break;
            }
            else if(usersName[i].equals(inputUser)){
                System.out.println("Contraseña incorrecta");
                break;
            }
            else if(passwords[i].equals(inputPassword)){
                System.out.println("Usuario incorrectoaa");
                break;
            }
            else if(!usersName[i].equals(inputUser) && !passwords[i].equals(inputPassword)){
                System.out.println("Usuario y Contraseña incorrecta ...");
                break;
            };
        };

    }
}
