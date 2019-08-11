package entidades.salario;
import static constantes.enteros.Enteros.CERO;

public class Salario {

    private double sueldo;
    private int numero;


    public Salario() {

        this.sueldo =CERO.getValor();
        this.numero =CERO.getValor();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSueldo() {

        return sueldo;
    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;
    }
}
