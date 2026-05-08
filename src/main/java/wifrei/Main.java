package wifrei;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao =
                new CartaoCredito("123456", "Mario", 5000, "123");

        ProcessadorPagamento processador =
                new ProcessadorPagamento(cartao);

        processador.executarVenda(2000);
        processador.executarVenda(4000);
        processador.executarVenda(500);
    }
}