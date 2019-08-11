package entidades.signo;
import static constantes.enteros.Enteros.CERO;


public class SignoZodiacal {

    private int dia;
    private int mes;

    public SignoZodiacal(){
        this.dia = CERO.getValor();
        this.mes = CERO.getValor();
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }
}
