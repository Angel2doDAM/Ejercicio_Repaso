package org.example;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int opcion; //opción elegida del usuario

    public static void main(String[] args) {

        //Mientras la opción elegida sea 0, preguntamos al usuario
        while(opcion != 0){
            //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("Elige opción:\n" +
                        "1.- Añadir Usuario\n" +
                        "2.- Buscar Usuario\n" +
                        "3.- Total Ingresos\n" +
                        "0.- Salir");
                //Recoger una variable por consola
                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch(opcion){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }

                System.out.println("\n"); //Mostrar un salto de línea en Java

            }catch(Exception e){
                System.out.println("Uoop! Error!");
            }
        }

    }
}
