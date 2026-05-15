package wifrei;

class Boleto implements MeiodePagamento{

    @Override
    public void pagar( double valor){
        System.out.println("Pagando R$ " + valor + " com Boleto: ");


    }

    @Override
    public String tipo() {
        return "Boleto";
    }
}
