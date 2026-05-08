package wifrei;

public class ProcessadorPagamento {

    private CartaoCredito cartao;

    public ProcessadorPagamento(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public void executarVenda(double valor) {

        System.out.println("\nTentando compra de R$ " + valor + "...");

        if (cartao.autorizarCompra(valor)) {
            System.out.println("Venda aprovada!");
            System.out.println("Limite restante: R$ " + cartao.getLimiteDisponivel());
        } else {
            System.out.println("Venda negada: limite insuficiente!");
            System.out.println("Limite disponível: R$ " + cartao.getLimiteDisponivel());
        }
    }
}