package DataServicesClases.ex09;

import java.util.List;

public class Order {
    private String orderId;
    private List<Product> productList;

    public Order(List<Product> productList, String orderId) {
        this.productList = productList;
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
