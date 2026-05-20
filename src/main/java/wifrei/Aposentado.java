package wifrei;

import java.time.LocalDate;

public class Aposentado extends Titular implements CalcularMensalidade {

    public Aposentado(String cpf, String nome, LocalDate dataDeNascimento) {
        super(cpf, nome, dataDeNascimento);

    }

    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() *0.8;
    }
}
