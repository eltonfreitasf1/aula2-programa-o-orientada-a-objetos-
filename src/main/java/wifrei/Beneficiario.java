package wifrei;

import java.time.LocalDate;
import java.time.Period;

public abstract class Beneficiario {

    private String cpf;
    private String nome;
    private LocalDate dataDeNascimento;
    private TipoCobertura tipoCobertura;

    public Beneficiario(String cpf, String nome, LocalDate dataDeNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public double calcularMensalidadeBase() {

        int idade = calcularIdade();

        if (idade < 18) {
            return 180;

        } else if (idade <= 59) {
            return 340;

        } else {
            return 620;
        }
    }

    //calcula diferença entre datas-guarda num Period
    // pega apenas os anos - retorna a idade
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataDeNascimento, dataAtual);
        return periodo.getYears();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}


