import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // Simulate user input for adding electronics
        Electronics electronicProduct = new Electronics("e1", 1, 123, 10, "Abc", 2);
        cart.addProduct((product)electronicProduct);

        // Simulate user input for adding clothing
        Clothing clothingProduct = new Clothing("c1", 2, 123, 10, "M", "Cotton");
        cart.addProduct(clothingProduct);

        // Display cart contents and total price
        cart.displayCart();
        System.out.println("Total Price: " + cart.calculateTotalPrice());
    }
}
