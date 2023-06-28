package components;

public class ProductDetails {

    private String code;
    private ProductType type;
    private int price;
    private int numberAvailable;

    public ProductDetails(String code, ProductType type, int price, int numberAvailable){
        this.code = code;
        this.type = type;
        this.price = price;
        this.numberAvailable = numberAvailable;
    }

    public String getCode() {
        return code;
    }
    public ProductType getType() {
        return type;
    }

    public int getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(int numberAvailable) {
        this.numberAvailable = numberAvailable;
    }

    public int getPrice() {
        return price;
    }
}
