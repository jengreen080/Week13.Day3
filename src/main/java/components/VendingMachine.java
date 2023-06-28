package components;

import interfaces.IManageInventory;
import interfaces.IManageMoney;

import java.util.HashMap;

public class VendingMachine implements IManageInventory, IManageMoney {

    private HashMap<String, ProductDetails> inventory;
    private int balance;
    private HashMap<Coin, Integer> vendingMachineFloat;

    public VendingMachine() {
        this.inventory = new HashMap<>();
        this.balance = 0;
        this.vendingMachineFloat = new HashMap<>();
    }

    public HashMap<String, ProductDetails> getInventory() {
        return inventory;
    }

    public int getBalance() {
        return balance;
    }

    public void addProductToInventory(ProductDetails details){
        inventory.put(details.getCode(),details);
    }

        public ProductDetails getProductDetails(String code){
        return inventory.get(code);
    }

    public int getNumberAvailableFromProductDetails(String code){
        return this.getProductDetails(code).getNumberAvailable();
    }

    public boolean checkIfBalanceIsGreaterThanPrice(String code){
        return getBalance() > getProductDetails(code).getPrice();
    }

    public void sellProduct(String code){
        int amount = this.getNumberAvailableFromProductDetails(code);
        if (amount > 0 && checkIfBalanceIsGreaterThanPrice(code)){
        this.getProductDetails(code).setNumberAvailable((amount-1));
        }
    }

    public void addToBalance(Coin coin){
        balance += coin.getValue();
    }

    public void clearBalance(){
        balance = 0;
    }
}



