package entidades.masa;

import static constantes.mensajes.Mensajes.*;
import static constantes.enteros.Enteros.*;
import static constantes.doubles.Doubles.*;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MasaCorporalLogica extends MasaCorporal {

    public double calcularIndiceMasa() {

        return ((this.getPesoPersona()) / (this.getAlturaPersona() * this.getAlturaPersona()));
    }

    public void validarPeso() {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("##.##", simbolo);
        if (calcularIndiceMasa() < DIECIOCHO_CINCO.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + BAJO_PESO.getMensaje());
        } else if (calcularIndiceMasa() >= DIECIOCHO_CINCO.getDecimales() && calcularIndiceMasa() <= VEINTICUATRO_NUEVE.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + NORMAL.getMensaje());
        } else if (calcularIndiceMasa() >= VEINTICINCO.getValor() && calcularIndiceMasa() <= VEINTINUEVE_NUEVE.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + SOBREPESO.getMensaje());
        } else if (calcularIndiceMasa() >= TREINTA.getValor() && calcularIndiceMasa() <= TREINTA_CUATRO_NUEVE.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + OBESIDAD_I.getMensaje());
        } else if (calcularIndiceMasa() >= TREINTA_CINCO.getValor() && calcularIndiceMasa() <= TREINTA_NUEVE_NUEVE.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + OBESIDAD_II
                    .getMensaje());
        } else if (calcularIndiceMasa() >= CUARENTA.getValor() && calcularIndiceMasa() <= CUARENTA_NUEVE_NUEVE.getDecimales()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + OBESIDAD_III.getMensaje());
        } else if (calcularIndiceMasa() >= CINCUENTA.getValor()) {
            JOptionPane.showMessageDialog(null, INDICE_MASA.getMensaje() + formateador.format(this.calcularIndiceMasa()) + SALTO_LINEA.getMensaje() + OBESIDAD_IV.getMensaje());
        }
    }
}
