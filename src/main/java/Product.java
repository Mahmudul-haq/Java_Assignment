public class Product {
    int discount;
    public static void main(String[] args) {
        Product laptop=new Product(15);
        int laptopPrice=laptop.GetPrice(85000,1);
        System.out.println("total price is  "+ laptopPrice);

        Product mouse=new Product(15);
        int mousePrice= mouse.GetPrice(2500,1);
         System.out.println("Total price is "+ mousePrice);

        int totalCost= laptopPrice+mousePrice;
        System.out.println("Total cost after discount "+ totalCost);

    }
    public Product(int discount) {
        this.discount = discount;
    }
    public int GetPrice(int price, int quantity){
        int totalPrice=(price*quantity)-((price*quantity*discount)/100);
        return totalPrice;
    }
}
