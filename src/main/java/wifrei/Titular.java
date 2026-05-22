package wifrei;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Beneficiario implements CalcularMensalidade {
    private List<Dependente> dependentes = new ArrayList<>();
    private TipoCobertura tipoCobertura;

    public Titular(String cpf, String nome, LocalDate dataDeNascimento) {
        super(cpf, nome, dataDeNascimento);
    }

    public void adicionarDependente(Dependente dependente) {
        if (dependente.calcularIdade() > 24) {
            System.out.println("Idade limite atingida");

        } else if (dependentes.size() >= 3) {
            System.out.println("Limite atingido");

        } else {
            dependentes.add(dependente);
        }
    }

    public void resumoContrato() {
        double total = calcularMensalidade();
        System.out.println("Titular: " + getNome());
        System.out.println("CPF: " + getCpf());
        for (Dependente dependente : dependentes) {
            System.out.println("Dependente: " + dependente.getNome());
            total = total + dependente.calcularMensalidade();
        }
        System.out.println("Total mensal: " + total);

    }

    public void tipoCobertura(TipoCobertura tipoCobertura) {
        System.out.println("Cobertura completa: " + tipoCobertura);
    }

    @Override
    public double calcularMensalidade() {
        return calcularMensalidadeBase();
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
}





