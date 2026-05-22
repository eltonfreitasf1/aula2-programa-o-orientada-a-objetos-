package wifrei;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        Titular titular = new Titular("378", "Elton", LocalDate.of(1989, 8, 1));

        Dependente dependente = new Dependente("351", "Dan", LocalDate.of(2017, 4, 21));
        titular.adicionarDependente(dependente);

        Aposentado aposentado = new Aposentado("400", "Carlos", LocalDate.of(1960, 5, 10));

        dependente.tipoCobertura(TipoCobertura.INTERNACAO);

        titular.tipoCobertura(TipoCobertura.INTERNACAO);

        Dependente dependente2 = new Dependente("999", "Pedro", LocalDate.of(1990, 1, 1));
        titular.adicionarDependente(dependente2);

        titular.resumoContrato();
    }
}