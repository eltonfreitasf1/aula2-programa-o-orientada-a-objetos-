package wifrei;

class CartaoCredito implements MeiodePagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " com Cartão de Crédito.");
    }

    @Override
    public String tipo() {
        return "Cartão de Crédito";
    }
}


