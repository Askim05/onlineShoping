public class Clothing extends product{
    String size;
    String material;

    public Clothing(String productName, int productId, double price, int quantityInStock,String size,String material) {
        super(productName, productId, price, quantityInStock);
        this.size=size;
        this.material=material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Product size: "+size);
        System.out.println("Product material: "+material);
    }
}
