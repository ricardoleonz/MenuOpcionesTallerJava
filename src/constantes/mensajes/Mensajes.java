package constantes.mensajes;

public enum Mensajes {

    MENSAJE_ACUARIO("Tu signo zodiacal es Acuario"),
    MENSAJE_PISCIS("Tu signo zodiacal es Piscis"),
    MENSAJE_ARIES("Tu signo zodiacal es Aries"),
    MENSAJE_LIBRA("Tu signo zodiacal es Libra"),
    MENSAJE_LEO("Tu signo zodiacal es Leo"),
    MENSAJE_VIRGO("Tu signo zodiacal es Virgo"),
    MENSAJE_GEMINIS("Tu signo zodiacal es Géminis"),
    MENSAJE_CAPRICORNIO("Tu signo zodiacal es Capricornio"),
    MENSAJE_CANCER("Tu signo zodiacal es Cáncer"),
    MENSAJE_ESCORPIO("Tu signo zodiacal es Escorpio"),
    MENSAJE_TAURO("Tu signo zodiacal es Táuro"),
    MENSAJE_SAGITARIO("Tu signo zodiacal es sagitario"),
    MENSAJE_DIA("Ingrese su día de nacimiento: "),
    MENSAJE_MES("Ingrese su mes de nacimiento en número: "),
    MENSAJE_MENU("Escoja la opción a realizar: "),
    SALTO_LINEA("\n"),
    ESCOGER_MASA("1-Calcular indice de masa corporal."),
    ESCOGER_SIGNO("2-Signo Zodiacal."),
    MENSAJE_PESO("Ingrese su peso en KG: "),
    MENSAJE_ALTURA("Ingrese su altura en METROS: "),
    INDICE_MASA("Su índice de masa corporal es "),
    ESCOGER_SALARIO("3-Salario Max., promedio y número total de salarios."),
    MENSAJE_DEFAULT("Opción NO VALIDA."),
    MENSAJE_CANTIDAD_SALARIOS("¿Cuantos salarios desea ingresar?"),
    MENSAJE_INGRESE_SALARIO("Ingrese salario "),
    MENSAJE_MAXIMO("El salario maximo es "),
    MENSAJE_PROMEDIO("El promedio de los salarios es: "),
    MENSAJE_CANTIDAD("El número de salarios ingresado es "),
    ESCOGER_VECTOR("4-Vectores positivos y negativos"),
    MENSAJE_NUMBERS("Cuantos números desea ingresar"),
    MENSAJE_VECTOR_POSITIVO("El promedio de los números positivos es "),
    MENSAJE_VECTOR_NEGATIVO("El promedio de los números negativos es "),
    MENSAJE_INGRESAR_VECTOR("Ingrese un número"),
    ESCOGER_SALIDA("0-Salir"),
    MENSAJE_SALIDA("HASTA PRONTO!"),
    BAJO_PESO("Esta bajo peso"),
    NORMAL("Esta normal"),
    SOBREPESO("Tiene sobrepeso"),
    OBESIDAD_I("Tiene obesidad tipo I"),
    OBESIDAD_II("Tiene obesidad tipo II"),
    OBESIDAD_III("Tiene obesidad tipo III"),
    OBESIDAD_IV("Tiene obesidad tipo IV");

        private String mensaje;
    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
