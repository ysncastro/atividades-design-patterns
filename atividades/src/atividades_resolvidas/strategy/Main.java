package atividades_resolvidas.strategy;

public class Main {

    public static void main(String[] args) {

        Compra compra = new Compra(10.00);

        compra.processaCompra(new CreditoStrategy());
        compra.processaCompra(new DebitoStrategy());
        compra.processaCompra(new VRStrategy());

        
    }

}
