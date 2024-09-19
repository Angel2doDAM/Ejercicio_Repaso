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

    public void buscarUsuarios(ArrayList lista, String correo){

    }

    public void totalIngresos(ArrayList lista){

    }
}
