package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int opcion = -1; //opción elegida del usuario

    public static void main(String[] args) {gi
        CRUDCliente crudCliente = new CRUDCliente();
        ArrayList<Usuario> lista = new ArrayList<>();

        //Mientras la opción elegida sea 0, preguntamos al usuario
        while(opcion != 0){
            //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("Elige opción:\n" + //prueba github
                        "1.- Añadir Usuario aaaaa\n" +
                        "2.- Buscar Usuario\n" +
                        "3.- Total Ingresos\n" +
                        "0.- Salir");
                //Recoger una variable por consola
                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch(opcion){
                    case 1:
                        Usuario usuario1 = new Usuario();
                        if(crudCliente.insertarCliente(lista, usuario1)){
                            System.out.println("\nEl usuario ha sido añadido con éxito\n");
                        } else {
                            System.out.println("\nNo pudo crearse el usuario\n");
                        }
                        break;

                    case 2:
                        System.out.println("Introduzca el correo de usuario a buscar:");
                        String Correo2 = (scanner.nextLine());
                        crudCliente.buscarUsuarios(lista, Correo2);
                        break;

                    case 3:
                        crudCliente.totalIngresos(lista);
                        break;

                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}