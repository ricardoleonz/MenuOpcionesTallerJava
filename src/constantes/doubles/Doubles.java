package constantes.doubles;

public enum Doubles {
    DIECIOCHO_CINCO(18.5),
    VEINTICUATRO_NUEVE(24.9),
    VEINTINUEVE_NUEVE(29.9),
    TREINTA_CUATRO_NUEVE(34.9),
    TREINTA_NUEVE_NUEVE(39.9),
    CUARENTA_NUEVE_NUEVE(49.9);


    private double decimales;

    Doubles(double d) {
        this.decimales = d;
    }

    public double getDecimales() {
        return decimales;
    }
}
