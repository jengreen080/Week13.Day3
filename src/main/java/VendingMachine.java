import interfaces.IManageInventory;
import java.util.HashMap;

public class VendingMachine implements IManageInventory {

    private HashMap<ProductType, ProductDetails> productInformation;
    private int balance;
    private HashMap<Coin, Integer> vendingMachineFloat;

    public VendingMachine() {
        this.productInformation = new HashMap<>();
        this.balance = 0;
        this.vendingMachineFloat = new HashMap<>();
    }

    public HashMap<ProductType, ProductDetails> getProductInformation() {
        return productInformation;
    }

    public void addProductToHashMap(ProductType type, ProductDetails details){
        productInformation.put(type,details);
    }

    public ProductDetails getProductDetails(ProductType type){
        return productInformation.get(type);
    }

    public int getNumberAvailableFromProductDetails(ProductType type){
        return this.getProductDetails(type).getNumberAvailable();
    }
    public void removeProductFromHashMap(ProductType type){
        int amount = this.getNumberAvailableFromProductDetails(type);
        if (amount > 0){
        this.getProductDetails(type).setNumberAvailable((amount-1));
        }
    }
}



