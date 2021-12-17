import vendaBuilder;
import venda;

public class PrincipalBuilder {

    public static void main(String[] args) {

       Venda venda  = new Venda Builder()
                            .setvenda ("9")
                            .setCliente(12, "lopes", "4002-8922")
                            .setVendedor(7, "gabriel")
                            .setProduto("Camisas", "branco" ,"M", new BigDecimal(30.00))
                            .setProduto("calcas", "preta","G", new BigDecimal(100.00))
                            .setProduto("short", "cinza","M", new BigDecimal(60.00))
                            .builder();

       venda .informacoes();

    }

}