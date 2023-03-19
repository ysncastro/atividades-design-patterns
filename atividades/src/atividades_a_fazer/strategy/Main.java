package atividades_a_fazer.strategy;

public class Main {

    public static void main(String[] args) {

        Compra compra = new Compra(10.00);

        compra.processarCompra("credito");
        compra.processarCompra("debito");
        compra.processarCompra("VR");

    }

}
