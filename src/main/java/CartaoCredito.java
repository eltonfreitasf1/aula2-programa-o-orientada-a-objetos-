package wifrei;

public class CartaoCredito {

    private String numeroCartao;
    private String titular;
    private double limiteDisponivel;
    private String cvv;

    public CartaoCredito(String numeroCartao, String titular, double limiteDisponivel, String cvv) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.limiteDisponivel = limiteDisponivel;
        this.cvv = cvv;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public String getTitular() {
        return titular;
    }

    // Regra de negócio dentro da própria classe (melhor prática)
    public boolean autorizarCompra(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return false;
        }

        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            return true;
        }

        return false;
    }

    public void aumentarLimite(double valor) {
        if (valor > 0) {
            limiteDisponivel += valor;
        }
    }
}