package atividades_resolvidas.strategy;

public class DebitoStrategy implements MetodoDePagamento{

    @Override
    public void processaCompra(Double valor) {
        System.out.println("Pagamento com cartão de débito, no valor de " + valor + " realizado!");
    }

}
