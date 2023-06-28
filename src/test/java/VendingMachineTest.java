import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    ProductDetails productDetails;


    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        productDetails = new ProductDetails("E7", 50, 4);
    }

    @Test
    public void hasProducts(){
        vendingMachine.getProductInformation().put(ProductType.CRISPS, productDetails),
        assertEquals(1, vendingMachine.getProductInformation().size());
    }
}
