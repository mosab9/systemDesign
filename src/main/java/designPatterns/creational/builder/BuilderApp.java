package designPatterns.creational.builder;

public class BuilderApp {
    public static void main(String[] args) {
        Product product = new Product.Builder().name("macBook").price("200").build();

        System.out.println(product.toString());
    }
}
