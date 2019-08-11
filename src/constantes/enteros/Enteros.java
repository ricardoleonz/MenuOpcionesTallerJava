package constantes.enteros;

public enum Enteros {

    CERO(0),
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    OCHO(8),
    NUEVE(9),
    DIEZ(10),
    ONCE(11),
    DOCE(12),
    VEINTE(20),
    DIECINUEVE(19),
    DIECIOCHO(18),
    VEINTIUNO(21),
    VEINTICUATRO(24),
    VEINTIDOS(22),
    VEINTICINCO(25),
    VEINTITRES(23),
    TREINTA(30),
    TREINTA_CINCO(35),
    CUARENTA(40),
    CINCUENTA(50);

    private int valor;

    Enteros(int i) {
        this.valor = i;
    }

    public int getValor() {
        return valor;
    }
}
