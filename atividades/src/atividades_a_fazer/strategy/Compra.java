package atividades_a_fazer.strategy;

public class Compra {

    Double valor;

    public Compra(Double valor) {
        this.valor = valor;
    }

    void processarCompra(String tipoDePagamento) {
        if(tipoDePagamento.equals("credito")) {
            System.out.println("Pagamento com cartão de crédito, no valor de " + valor + " realizado!");
        }
        if(tipoDePagamento.equals("debito")) {
            System.out.println("Pagamento com cartão de débito, no valor de " + valor + " realizado!");
        }
        if(tipoDePagamento.equals("VR")) {
            System.out.println("Pagamento com VR, no valor de " + valor + " realizado!");
        }
    }

}
