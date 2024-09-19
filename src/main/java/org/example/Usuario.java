package org.example;

public class Usuario extends Cliente{

    private boolean premium;

    public Usuario() {
    }

    public Usuario(String correo, String contrasenia, double descuentos, boolean premium) {
        super(correo, contrasenia, descuentos);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}