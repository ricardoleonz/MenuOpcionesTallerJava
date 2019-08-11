package entidades.masa;

import static constantes.enteros.Enteros.CERO;

public class MasaCorporal {

    private double pesoPersona;
    private double alturaPersona;

    public MasaCorporal() {
        this.pesoPersona = CERO.getValor();
        this.alturaPersona = CERO.getValor();
    }

    public void setPesoPersona(double pesoPersona) {
        this.pesoPersona = pesoPersona;
    }

    public double getPesoPersona() {
        return pesoPersona;
    }

    public void setAlturaPersona(double alturaPersona) {
        this.alturaPersona = alturaPersona;
    }

    public double getAlturaPersona() {
        return alturaPersona;
    }
}
