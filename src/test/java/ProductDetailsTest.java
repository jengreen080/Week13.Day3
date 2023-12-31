import components.ProductDetails;
import components.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductDetailsTest {

    ProductDetails productDetails;

    @Before
    public void before(){
        productDetails = new ProductDetails("A1", ProductType.COLA,65, 10);
    }

    @Test
    public void hasCode(){
        assertEquals("A1", productDetails.getCode());
    }
}
