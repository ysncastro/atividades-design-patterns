package atividades_resolvidas.strategy;

public class Compra {

    Double valor;

    public Compra(Double valor) {
        this.valor = valor;
    }

    void processaCompra(MetodoDePagamento metodoDePagamento) {
        metodoDePagamento.processaCompra(valor);
    }


}
