import components.Coin;
import components.ProductDetails;
import components.ProductType;
import components.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    ProductDetails productDetails;


    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        productDetails = new ProductDetails("E7", ProductType.CRISPS, 50, 4);
    }

    @Test
    public void canAddProduct(){
        vendingMachine.addProductToInventory(productDetails);
        assertEquals(1, vendingMachine.getInventory().size());
    }
    @Test
    public void canSellProduct(){
        vendingMachine.addToBalance(Coin.ONE_POUND);
        vendingMachine.addProductToInventory(productDetails);
        vendingMachine.sellProduct("E7");
        assertEquals(3, vendingMachine.getNumberAvailableFromProductDetails("E7"));
    }
    @Test
    public void cantRemoveProduct(){
        vendingMachine.addToBalance(Coin.ONE_POUND);
        vendingMachine.addToBalance(Coin.ONE_POUND);
        vendingMachine.addToBalance(Coin.FIFTY);
        vendingMachine.addProductToInventory(productDetails);
        vendingMachine.sellProduct("E7");
        vendingMachine.sellProduct("E7");
        vendingMachine.sellProduct("E7");
        vendingMachine.sellProduct("E7");
        vendingMachine.sellProduct("E7");
        assertEquals(0, vendingMachine.getNumberAvailableFromProductDetails("E7"));
    }

    @Test
    public void canAddToBalance(){
        vendingMachine.addToBalance(Coin.ONE_POUND);
        vendingMachine.addToBalance(Coin.ONE_POUND);
        assertEquals(200, vendingMachine.getBalance());
    }

    @Test
    public void canClearBalance(){
        vendingMachine.addToBalance(Coin.ONE_POUND);
        vendingMachine.clearBalance();
        assertEquals(0, vendingMachine.getBalance());
    }

}
