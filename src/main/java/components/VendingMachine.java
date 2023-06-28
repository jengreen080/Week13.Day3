package components;

import interfaces.IManageInventory;
import interfaces.IManageMoney;

import java.util.HashMap;

public class VendingMachine implements IManageInventory, IManageMoney {

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

    public boolean checkIfBalanceIsGreaterThanPrice(ProductType type){
        return getBalance() > getProductDetails(type).getPrice();
    }

    public void sellProduct(ProductType type){
        int amount = this.getNumberAvailableFromProductDetails(type);
        if (amount > 0 && checkIfBalanceIsGreaterThanPrice(type)){
        this.getProductDetails(type).setNumberAvailable((amount-1));
        }
    }


    public int getBalance() {
        return balance;
    }

    public void addToBalance(Coin coin){
        balance += coin.getValue();
    }

    public void clearBalance(){
        balance = 0;
    }
}



