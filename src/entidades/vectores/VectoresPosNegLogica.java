package entidades.vectores;

import javax.swing.*;
import static constantes.mensajes.Mensajes.*;
import static constantes.enteros.Enteros.*;

public class VectoresPosNegLogica extends VectoresPosNeg{

    public void llenarVectorPosNeg(){

        int ingresar = Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_NUMBERS.getMensaje()));
        int [] cantidadPositivos = new int[ingresar];
        int [] cantidadNegativos = new int[ingresar];
        int conP=CERO.getValor();
        int conN=CERO.getValor();

        for (int i = CERO.getValor(); i<ingresar; i++) {

            int numeroCualquiera = Integer.parseInt(JOptionPane.showInputDialog(null,MENSAJE_INGRESAR_VECTOR.getMensaje()));

            if(numeroCualquiera<CERO.getValor()){
                cantidadNegativos[i] = numeroCualquiera;
                conN += UNO.getValor();
            }else{
                cantidadPositivos[i] = numeroCualquiera;
                conP +=UNO.getValor();
            }
        }
        double acumPos = CERO.getValor();
        double acumNeg = CERO.getValor();

        for (int i = CERO.getValor(); i<ingresar; i++){

            acumPos += cantidadPositivos[i];
            acumNeg += cantidadNegativos[i];

        }
        if(conP!=CERO.getValor() && conN!=CERO.getValor()) {
            acumPos = acumPos / conP;
            acumNeg = acumNeg / conN;
            JOptionPane.showMessageDialog(null,MENSAJE_VECTOR_POSITIVO.getMensaje()+acumPos+
                    SALTO_LINEA.getMensaje()+MENSAJE_VECTOR_NEGATIVO.getMensaje()+acumNeg);
        }

    }
}
