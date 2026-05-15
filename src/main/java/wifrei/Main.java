package wifrei;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<MeiodePagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Pix());
        pagamentos.add(new Boleto());

        for (MeiodePagamento pagamento : pagamentos) {
            pagamento.pagar(100.0);
        }
    }
}

