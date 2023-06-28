import components.Coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before(){
        coin =  Coin.FIFTY;
    }

    @Test
    public void hasValue(){
        assertEquals(50, coin.getValue());
    }
}
