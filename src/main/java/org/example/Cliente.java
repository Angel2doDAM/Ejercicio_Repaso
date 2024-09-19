package org.example;

public class Cliente {

    private String correo;
    private String contrasenia;
    private double importe;

    public Cliente() {
    }

    public Cliente(String correo, String contrasenia, double importe) {
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.importe = importe;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}