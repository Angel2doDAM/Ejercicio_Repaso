package org.example;
import java.util.Scanner;

import java.util.ArrayList;

public class CRUDCliente {
    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola

    public boolean insertarCliente(ArrayList<Usuario> lista, Usuario usu){

        System.out.println("Introduzca el correo de usuario:");
        String Correo = (scanner.nextLine());
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
            scanner.nextLine();//Si no recuerdas que lea texto, salta el catch
        } while (opcion_premium != 1 && opcion_premium != 0);
        usu = new Usuario(Correo, Contra, descuento, premium);

        boolean realizado=false;
        /*if(!lista.contains(usu)){
            realizado = true;
            lista.add(usu);
        }*/
        for (Usuario usuario : lista){

        }
        return realizado;
    }

    public void buscarUsuarios(ArrayList<Usuario> lista, String correo){
        boolean encontrado = false;
        for (Usuario usuario : lista) {
            if (usuario.getCorreo().equals(correo)) {
                System.out.println(" ¡Usuario encontrado!");
                System.out.println("     Correo: " + usuario.getCorreo());
                System.out.println("     Contraseña: " + usuario.getContrasenia());
                System.out.println("     Descuentos: " + usuario.getdescuentos());
                System.out.println("     Premium: " + (usuario.isPremium() ? "Sí" : "No") + "\n");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El usuario con el correo " + correo + " no existe.");
        }
    }

    public void totalIngresos(ArrayList<Usuario> lista){
        double totalPago=0;
        for (Usuario usuario : lista) {
            if(usuario.isPremium()){
                totalPago = totalPago + (35.5 - usuario.getdescuentos());
            } else {
                totalPago = totalPago + (20.5 - usuario.getdescuentos());
            }
        }
        System.out.println("El total de ingresos a recibir es de " +totalPago +"€");
    }
}
