package atividades_resolvidas.builder;

public class Main {

    public static void main(String[] args) {
        ElectronicProduct.ElectronicProductBuilder builder = new ElectronicProduct.ElectronicProductBuilder();
        ElectronicProduct product = builder.setName("Smartphone")
                .setBrand("Samsung")
                .setPrice(1000.0)
                .setQuantityAvailable(10)
                .setDescription("Galaxy S21")
                .build();

        System.out.println("Product name: " + product.getName());
        System.out.println("Brand: " + product.getBrand());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity available: " + product.getQuantityAvailable());
        System.out.println("Description: " + product.getDescription());
    }

}
