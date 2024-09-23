package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int opcion = -1; //opción elegida del usuario

    public static void main(String[] args) {
        String Correo;
        CRUDCliente crudCliente = new CRUDCliente();
        ArrayList<Usuario> lista = new ArrayList<>();

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
                        System.out.println("Introduzca el correo de usuario:");
                            Correo = (scanner.nextLine());
                        System.out.println("Introduzca la ontraseña de " + Correo + ":");
                            String Contra = (scanner.nextLine());
                        System.out.println("Introduzca el descuento a realizar:");
                            double descuento = (scanner.nextDouble());
                        System.out.println("¿Desea contratar la tarifa premium? (1=si / 0=no)");
                            boolean premium = false;
                            int opcion_premium;
                            do {
                                opcion_premium = (scanner.nextInt());
                                switch (opcion_premium) {
                                    case 1:
                                        premium = true;
                                        System.out.println("Version premium activada");
                                        break;
                                    case 0:
                                        System.out.println("Version premium desactivada");
                                        break;
                                    default:
                                        System.out.println("Creo que no lo ha entendido, es 1 o 2");
                                        System.out.println("Pruebe de nuevo:");
                                    break;
                                }
                            } while (opcion_premium != 1 && opcion_premium != 0);
                        Usuario usuario1 = new Usuario(Correo, Contra, descuento, premium);
                        if(crudCliente.insertarCliente(lista, usuario1)){
                            System.out.println("El usuario ha sido añadido con éxito");
                        } else {
                            System.out.println("No pudo crearse el usuario");
                        }
                        break;

                    case 2:
                        System.out.println("Introduzca el correo de usuario a buscar:");
                        Correo = (scanner.nextLine());
                        crudCliente.buscarUsuarios(lista, Correo);
                        break;
                    case 3:
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