public class product {
    public String productName;
    public  int productId;
    public double price;
    public int quantityInStock;
    public product(String productName,int productId,double price,int quantityInStock){
        this.productName=productName;
        this.productId=productId;
        this.price=price;
        this.quantityInStock=quantityInStock;
    }
    public void displayDetails(){
        System.out.println("productName: "+productName);
        System.out.println("productId: "+productId);
        System.out.println("price: "+price);
        System.out.println("quantityInStock: "+quantityInStock);
    }

}
