import model.*;
import service.serviceProduct;
import enums.productType;

public class Main {
    public static void main(String[] args) {

        serviceProduct inventory = new serviceProduct();

        inventory.addProduct();
        inventory.listProducts();
        inventory.offerPrice(10D);
        inventory.actualizePrice();
    }
}