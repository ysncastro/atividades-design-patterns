package atividades_resolvidas.strategy;

public class CreditoStrategy implements MetodoDePagamento{

    @Override
    public void processaCompra(Double valor) {
        System.out.println("Pagamento com cartão de crédito, no valor de " + valor + " realizado!");
    }

}
