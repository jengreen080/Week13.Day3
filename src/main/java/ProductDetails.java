public class ProductDetails {

    private String code;
    private int price;
    private int numberAvailable;

    public ProductDetails(String code, int price, int numberAvailable){
        this.code = code;
        this.price = price;
        this.numberAvailable = numberAvailable;
    }

    public String getCode() {
        return code;
    }

    public int getNumberAvailable() {
        return numberAvailable;
    }

    public void setNumberAvailable(int numberAvailable) {
        this.numberAvailable = numberAvailable;
    }
}
