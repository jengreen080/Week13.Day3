package components;

import interfaces.IManageInventory;
import java.util.HashMap;

public class VendingMachine implements IManageInventory {

    private HashMap<ProductType, ProductDetails> inventory;
    private int balance;
    private HashMap<Coin, Integer> vendingMachineFloat;

    public VendingMachine() {
        this.inventory = new HashMap<>();
        this.balance = 0;
        this.vendingMachineFloat = new HashMap<>();
    }

    public HashMap<ProductType, ProductDetails> getInventory() {
        return inventory;
    }

    public void addProductToInventory(ProductType type, ProductDetails details){
        inventory.put(type,details);
    }

    public ProductDetails getProductDetails(ProductType type){
        return inventory.get(type);
    }

    public int getNumberAvailableFromProductDetails(ProductType type){
        return this.getProductDetails(type).getNumberAvailable();
    }
    public void sellProduct(ProductType type){
        int amount = this.getNumberAvailableFromProductDetails(type);
        if (amount > 0){
        this.getProductDetails(type).setNumberAvailable((amount-1));
        }
    }
}



