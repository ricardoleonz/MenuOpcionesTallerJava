package entidades.salario;

import static constantes.enteros.Enteros.CERO;
import static constantes.mensajes.Mensajes.*;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SalarioLogica extends Salario {

    public void agregarSalarios() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);

        double acumulador = CERO.getValor();
        double mayor = CERO.getValor();

        String entrada = JOptionPane.showInputDialog(null, MENSAJE_CANTIDAD_SALARIOS.getMensaje());
        setNumero(Integer.parseInt(entrada));

        for (int i = CERO.getValor(); i < getNumero(); i++) {

            String salarioIngresado = JOptionPane.showInputDialog(null, MENSAJE_INGRESE_SALARIO.getMensaje() + (i + 1));
            setSueldo(Double.parseDouble(salarioIngresado));
            acumulador = acumulador + getSueldo();
            if (getSueldo() > mayor) {
                mayor = getSueldo();
            }
        }
        JOptionPane.showMessageDialog(null, MENSAJE_MAXIMO.getMensaje() + formateador.format(mayor)
                + SALTO_LINEA.getMensaje() +
                MENSAJE_PROMEDIO.getMensaje() + formateador.format(acumulador / getNumero()) + SALTO_LINEA.getMensaje() + MENSAJE_CANTIDAD.getMensaje() + getNumero());
    }
}
