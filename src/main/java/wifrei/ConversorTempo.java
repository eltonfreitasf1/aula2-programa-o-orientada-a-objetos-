package wifrei;

public class ConversorTempo {

    public static String formatarMinutos(int minutos) {

        int horas = minutos / 60;
        int mins = minutos % 60;

        return horas + "h " + mins + "min";
    }
}

