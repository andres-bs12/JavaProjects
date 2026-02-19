package DataServicesClases.ex09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Ketchup", 20.0);
        Product product2 = new Product("Mayo", 10.0);

        Order order1 = new Order (new ArrayList<>(List.of(product1, product2)), "A123");
        //Order order1 = new Order (new ArrayList<>(List.of()), "A123");

        OrderService service = new OrderService();

        System.out.println("Total order price = " + service.calculateTotalOrder(order1));
        System.out.println("The avg price is = " + (service.calculateAveragePrice(order1)));
        System.out.println("The most expensive item price is = " + service.findMostExpensive(order1));
    }
}
