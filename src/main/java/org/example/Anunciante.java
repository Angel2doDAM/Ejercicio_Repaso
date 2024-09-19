package org.example;

public class Anunciante extends Cliente {

    private int num_anuncios;

    public Anunciante() {
    }

    public Anunciante(String correo, String contrasenia, double importe, int num_anuncios) {
        super(correo, contrasenia, importe);
        this.num_anuncios = num_anuncios;
    }

    public int getNum_anuncios() {
        return num_anuncios;
    }

    public void setNum_anuncios(int num_anuncios) {
        this.num_anuncios = num_anuncios;
    }
}