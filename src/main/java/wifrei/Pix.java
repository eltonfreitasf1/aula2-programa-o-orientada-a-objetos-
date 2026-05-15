package wifrei;

class Pix implements MeiodePagamento{

    @Override
    public void pagar( double valor){
        System.out.println("Pagando R$ " + valor + " com Pix: ");
    }

    @Override
    public String tipo() {
        return "Pix";
    }


}

