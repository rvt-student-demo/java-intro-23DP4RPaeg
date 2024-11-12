package lv.rvt;

public class Product {
    private double price;
    private String name;
    private int quantity;

    public Product(Double initialprice, String initialname, int initialquantity){
            this.price = initialprice;
            this.name = initialname;
            this.quantity = initialquantity;
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

}
