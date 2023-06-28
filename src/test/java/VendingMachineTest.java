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
        productDetails = new ProductDetails("E7", 50, 4);
    }

    @Test
    public void canAddProduct(){
        vendingMachine.addProductToInventory(ProductType.CRISPS, productDetails);
        assertEquals(1, vendingMachine.getInventory().size());
    }
    @Test
    public void canRemoveProduct(){
        vendingMachine.addProductToInventory(ProductType.CRISPS, productDetails);
        vendingMachine.sellProduct(ProductType.CRISPS);
        assertEquals(3, vendingMachine.getNumberAvailableFromProductDetails(ProductType.CRISPS));
    }
    @Test
    public void cantRemoveProduct(){
        vendingMachine.addProductToInventory(ProductType.CRISPS, productDetails);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        vendingMachine.sellProduct(ProductType.CRISPS);
        assertEquals(0, vendingMachine.getNumberAvailableFromProductDetails(ProductType.CRISPS));
    }

}
