
import java.util.*;


// Shopping Cart class
class ShoppingCart {
    private List<product> cartItems = new ArrayList<>();

    public void addProduct(product product) {
        cartItems.add(product);
    }

    public void displayCart() {

        for (product item : cartItems) {
            item.displayDetails();

        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (product item : cartItems) {
            totalPrice += item.price;
        }
        return totalPrice;

    }
}