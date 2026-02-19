package DataServicesClases.ex09;

import java.util.List;

public class OrderService {

    public double calculateTotalOrder(Order order) {
        double totalPrice = 0;
        if (order.getProductList() != null) {
            for (Product product : order.getProductList()) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    public String findMostExpensive(Order order) {
        if (order == null || order.getProductList() == null  || order.getProductList().isEmpty()) {
            return "No products in this order";
        }
        Product expensivestProduct = order.getProductList().get(0);
        for (Product product : order.getProductList()) {
            if (product.getPrice() > expensivestProduct.getPrice()) {
                expensivestProduct = product;
            }
        }
        return expensivestProduct.getName();

    }


    public double calculateAveragePrice(Order order) {

        if (order.getProductList() == null || order.getProductList().isEmpty()) {
            return 0.0;
        }

        double totalPrice = calculateTotalOrder(order);
        int numItems = order.getProductList().size();

        return totalPrice / numItems;
    }

}
