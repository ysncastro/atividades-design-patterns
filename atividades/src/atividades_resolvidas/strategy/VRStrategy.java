package atividades_resolvidas.strategy;

public class VRStrategy implements MetodoDePagamento{

    @Override
    public void processaCompra(Double valor) {
        System.out.println("Pagamento com VR, no valor de " + valor + " realizado!");
    }

}
