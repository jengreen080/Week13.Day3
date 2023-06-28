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
        vendingMachine.addProductToHashMap(ProductType.CRISPS, productDetails);
        assertEquals(1, vendingMachine.getProductInformation().size());
    }
    @Test
    public void canRemoveProduct(){
        vendingMachine.addProductToHashMap(ProductType.CRISPS, productDetails);
        vendingMachine.removeProductFromHashMap(ProductType.CRISPS);
        assertEquals(3, vendingMachine.getNumberAvailableFromProductDetails(ProductType.CRISPS));
    }

}
