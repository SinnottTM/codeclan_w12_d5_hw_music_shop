import musicShop.ISell;
import musicShop.Shop;
import musicShop.instruments.Guitar;
import musicShop.instruments.Instrument;
import musicShop.instruments.InstrumentType;
import musicShop.nonInstruments.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell guitar, drumsticks;

    @Before
    public void before() {
        shop = new Shop("The Music Shop");
        guitar = new Guitar( InstrumentType.STRING, 100.00, 200.00, "black", 6, 2);
        drumsticks = new Drumsticks("5A Drumsticks", 15, 25, "Wood", 420);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        shop.addToStock(drumsticks);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void totalProfitWorks() {
        shop.addToStock(guitar);
        shop.addToStock(drumsticks);
        assertEquals(110, shop.totalPotentialProfit(), 0.0);
    }
}
