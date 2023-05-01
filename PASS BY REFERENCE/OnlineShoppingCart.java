//real time e.g on PASS BY REFERENCE

import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingCart {

    public static class Cart {
        private List<Product> products;

        public Cart() {
            products = new ArrayList<>();
        }

        public void addProduct(Product product, int quantity) {
            product.setQuantity(quantity);
            products.add(product);
        }

        public double getTotal() {
            double total = 0;
            for (Product product : products) {
                total += product.getTotalPrice();
            }
            return total;
        }

        public List<Product> getProducts() {
            return products;
        }
    }

    public static class Customer {
        private int id;
        private String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class Payment {
        private int id;
        private double amount;

        public Payment(int id, double amount) {
            this.id = id;
            this.amount = amount;
        }

        public int getId() {
            return id;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static class Product {
        private String name;
        private double price;
        private int quantity;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
            this.quantity = 0;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Shirt", 29.99), 2);
        cart.addProduct(new Product("Jeans", 39.99), 1);

        Customer customer1 = new Customer(1, "YESH RIKKI");
        Payment payment = new Payment(1, cart.getTotal());

        System.out.println("Customer: " + customer1.getName());
        System.out.println("Products:");
        for (Product product : cart.getProducts()) {
            System.out
                    .println("- " + product.getName() + " x" + product.getQuantity() + ": $" + product.getTotalPrice());
        }
        System.out.println("Total: $" + payment.getAmount());
    }
}
