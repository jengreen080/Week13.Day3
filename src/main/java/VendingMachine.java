import java.util.HashMap;

public class VendingMachine {

    private HashMap <ProductType, ProductDetails> productInformation;
    private int balance;
    private HashMap <Coin, Integer> vendingMachineFloat;

    public VendingMachine() {
        this.productInformation = new HashMap<>();
        this.balance = 0;
        this.vendingMachineFloat = new HashMap<>();
    }

}


