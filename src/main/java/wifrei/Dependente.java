package wifrei;

import java.time.LocalDate;

public class Dependente extends Beneficiario implements CalcularMensalidade {


    public Dependente(String cpf, String nome, LocalDate dataDeNascimento) {
        super(cpf, nome, dataDeNascimento);
    }

    public void tipoCobertura(TipoCobertura tipoCobertura) {
        if (tipoCobertura == TipoCobertura.INTERNACAO) {
            System.out.println("Dependente nao tem internacao");
        }
    }


    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase()*0.7;

    }
}
