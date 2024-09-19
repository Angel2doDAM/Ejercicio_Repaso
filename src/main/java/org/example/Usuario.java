package org.example;

public class Usuario extends Cliente{

    private boolean premium;

    public Usuario() {
    }

    public Usuario(String correo, String contrasenia, double importe, boolean premium) {
        super(correo, contrasenia, importe);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}