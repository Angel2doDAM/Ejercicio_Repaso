package org.example;

import java.util.ArrayList;

public class CRUDCliente {

    public boolean insertarCliente(ArrayList lista, Usuario usu){
        boolean realizado=false;
        if(!lista.contains(usu)){
            realizado = true;
            lista.add(usu);
        }
        return realizado;
    }

    public void buscarUsuarios(ArrayList<Usuario> lista, String correo){
        boolean encontrado = false;
        for (Usuario usuario : lista) {
            if (usuario.getCorreo().equals(correo)) {
                System.out.println("¡Usuario encontrado!");
                System.out.println("Correo: " + usuario.getCorreo());
                System.out.println("Contraseña: " + usuario.getContrasenia());
                System.out.println("Descuentos: " + usuario.getdescuentos());
                System.out.println("Premium: " + (usuario.isPremium() ? "Sí" : "No"));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El usuario con el correo " + correo + " no existe.");
        }
    }

    public void totalIngresos(ArrayList lista){

    }
}
