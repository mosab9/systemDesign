package designPatterns.creational.builder;

public class Product {
    private String name;
    private String price;
    // Other attributes...

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        // Set other attributes...
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    // Getters for attributes (optional)...

    public static class Builder {
        private String name;
        private String price;
        // Other attributes...

        public Builder() {
            // Set default values if needed...
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }
        // Methods for setting other attributes...

        public Product build() {
            return new Product(this);
        }
    }
}
