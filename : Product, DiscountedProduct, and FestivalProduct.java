    class Product {
    private String name;
    private double price;

     Product(String name, double price) {
       this.name = name;
       this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double calculatePrice() {
        return price;
    }

    public double calculatePrice(int quantity) {
        return price * quantity;
    }
}
    class DiscountedProduct extends Product{
    private double discount;
    DiscountedProduct(String name, double price, double discount){
        super(name, price);
        this.discount=discount;
    }
    @Override
    public double calculatePrice(){
        return getPrice() - (getPrice() * discount / 100);
    }
    @Override
    public double calculatePrice(int quantity){
        return calculatePrice() * quantity;
    }
}
     class FestivalProduct extends DiscountedProduct{
     FestivalProduct(String name, double price, double discount){
        super(name, price, discount);
    }
    public double calculatePrice(int quantity){
        double total = super.calculatePrice(quantity);
        if(quantity >= 5){
            total = total - 50;
        }
        return total;
    }
}
