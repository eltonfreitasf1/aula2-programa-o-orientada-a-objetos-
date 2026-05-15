package wifrei;

public interface MeiodePagamento {

    void pagar(double valor);

    String tipo();

    public interface MeioPagamento {

        void pagar(double valor);

        String tipo();
    }
}