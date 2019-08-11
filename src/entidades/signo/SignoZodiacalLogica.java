package entidades.signo;

import javax.swing.*;

import static constantes.enteros.Enteros.*;
import static constantes.mensajes.Mensajes.*;

public class SignoZodiacalLogica extends SignoZodiacal {

    public void consultarSignoZodiacal() {

        String dia = JOptionPane.showInputDialog(null, MENSAJE_DIA.getMensaje());
        String mes = JOptionPane.showInputDialog(null, MENSAJE_MES.getMensaje());
        setMes(Integer.parseInt(mes));
        setDia(Integer.parseInt(dia));
    }

    public void enero() {
        if (this.getMes() == 1) {
            if (this.getDia() >= VEINTE.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_ACUARIO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_CAPRICORNIO.getMensaje());
            }
        }
    }

    public void febrero() {
        if (this.getMes() == 2) {
            if (this.getDia() <= DIECIOCHO.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_ACUARIO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_PISCIS.getMensaje());
            }
        }
    }

    public void marzo() {
        if (this.getMes() == 3) {
            if (this.getDia() <= VEINTE.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_PISCIS.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_ARIES.getMensaje());
            }
        }
    }

    public void abril() {
        if (this.getMes() == 4) {
            if (this.getDia() <= VEINTE.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_ARIES.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_TAURO.getMensaje());
            }
        }
    }

    public void mayo() {
        if (this.getMes() == 5) {
            if (this.getDia() <= VEINTE.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_TAURO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_GEMINIS.getMensaje());
            }
        }
    }

    public void junio() {
        if (this.getMes() == 6) {
            if (this.getDia() <= VEINTICUATRO.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_GEMINIS.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_CANCER.getMensaje());
            }
        }
    }

    public void julio() {
        if (this.getMes() == 7) {
            if (this.getDia() <= VEINTIDOS.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_CANCER.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_LEO.getMensaje());
            }
        }
    }

    public void agosto() {
        if (this.getMes() == 8) {
            if (this.getDia() <= VEINTITRES.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_LEO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_VIRGO.getMensaje());
            }
        }
    }

    public void septiembre() {
        if (this.getMes() == 9) {
            if (this.getDia() <= VEINTITRES.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_VIRGO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_LIBRA.getMensaje());
            }
        }
    }

    public void octubre() {
        if (this.getMes() == 10) {
            if (this.getDia() <= VEINTIDOS.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_LIBRA.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_ESCORPIO.getMensaje());
            }
        }
    }

    public void noviembre() {
        if (this.getMes() == 11) {
            if (this.getDia() <= VEINTIDOS.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_ESCORPIO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_SAGITARIO.getMensaje());
            }
        }
    }

    public void diciembre() {
        if (this.getMes() == 12) {
            if (this.getDia() <= VEINTIUNO.getValor()) {
                JOptionPane.showMessageDialog(null, MENSAJE_SAGITARIO.getMensaje());
            } else {
                JOptionPane.showMessageDialog(null, MENSAJE_CAPRICORNIO.getMensaje());
            }
        }
    }
}
