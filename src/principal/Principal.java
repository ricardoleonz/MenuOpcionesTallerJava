
package principal;

import entidades.masa.MasaCorporalLogica;
import entidades.salario.SalarioLogica;
import entidades.signo.SignoZodiacalLogica;
import entidades.vectores.VectoresPosNegLogica;


import javax.swing.*;

import static constantes.mensajes.Mensajes.*;

public class Principal {

    public static void main(String[] args) {

        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, MENSAJE_MENU.getMensaje() + SALTO_LINEA.getMensaje() +
                ESCOGER_MASA.getMensaje() + SALTO_LINEA.getMensaje() +
                ESCOGER_SIGNO.getMensaje() + SALTO_LINEA.getMensaje() +
                ESCOGER_SALARIO.getMensaje() + SALTO_LINEA.getMensaje() +
                ESCOGER_VECTOR.getMensaje() + SALTO_LINEA.getMensaje() +
                ESCOGER_SALIDA.getMensaje()));


        switch (opc) {

            case 1:

                MasaCorporalLogica masaCorporalLogica = new MasaCorporalLogica();
                double peso = Double.parseDouble(JOptionPane.showInputDialog(null, MENSAJE_PESO.getMensaje()));
                double altura = Double.parseDouble(JOptionPane.showInputDialog(null, MENSAJE_ALTURA.getMensaje()));

                masaCorporalLogica.setPesoPersona(peso);
                masaCorporalLogica.setAlturaPersona(altura);

                masaCorporalLogica.validarPeso();
                Principal.main(null);
                break;


            case 2:

                SignoZodiacalLogica signoZodiacalLogica = new SignoZodiacalLogica();
                signoZodiacalLogica.consultarSignoZodiacal();
                signoZodiacalLogica.enero();
                signoZodiacalLogica.febrero();
                signoZodiacalLogica.marzo();
                signoZodiacalLogica.abril();
                signoZodiacalLogica.mayo();
                signoZodiacalLogica.junio();
                signoZodiacalLogica.julio();
                signoZodiacalLogica.agosto();
                signoZodiacalLogica.septiembre();
                signoZodiacalLogica.octubre();
                signoZodiacalLogica.noviembre();
                signoZodiacalLogica.diciembre();
                Principal.main(null);
                break;

            case 3:

                SalarioLogica salarioLogica = new SalarioLogica();
                salarioLogica.agregarSalarios();
                Principal.main(null);
                break;

            case 4:
                VectoresPosNegLogica vectoresPosNegLogica = new VectoresPosNegLogica();
                vectoresPosNegLogica.llenarVectorPosNeg();
                Principal.main(null);
                break;

            case 0:
                JOptionPane.showMessageDialog(null, MENSAJE_SALIDA.getMensaje());
                break;

            default:
                JOptionPane.showMessageDialog(null, MENSAJE_DEFAULT.getMensaje());
        }
    }
}
