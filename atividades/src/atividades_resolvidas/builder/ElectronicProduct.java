package atividades_resolvidas.builder;

public class ElectronicProduct {
    private String name;
    private String brand;
    private double price;
    private int quantityAvailable;
    private String description;

    public ElectronicProduct(String name, String brand, double price, int quantityAvailable, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public String getDescription() {
        return description;
    }

    public static class ElectronicProductBuilder {
        private String name;
        private String brand;
        private double price;
        private int quantityAvailable;
        private String description;

        public ElectronicProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ElectronicProductBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ElectronicProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ElectronicProductBuilder setQuantityAvailable(int quantityAvailable) {
            this.quantityAvailable = quantityAvailable;
            return this;
        }

        public ElectronicProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ElectronicProduct build() {
            return new ElectronicProduct(name, brand, price, quantityAvailable, description);
        }
    }
}
