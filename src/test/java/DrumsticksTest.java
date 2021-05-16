import musicShop.nonInstruments.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks("5A Drumsticks", 15, 25, "Wood", 420);
    }

    @Test
    public void drumsticksHaveDesc() {
        assertEquals("5A Drumsticks", drumsticks.getDescription());
    }

    @Test
    public void drumsticksHaveBuyPrice() {
        assertEquals(15, drumsticks.getBuyPrice(), 0.0);
    }

    @Test
    public void drumsticksHaveSellPrice() {
        assertEquals(25, drumsticks.getSellPrice(), 0.0);
    }

    @Test
    public void drumsticksHaveMaterial() {
        assertEquals("Wood", drumsticks.getMaterial());
    }

    @Test
    public void drumsticksHaveLength() {
        assertEquals(420, drumsticks.getLength(), 0.0);
    }

    @Test
    public void drumstickMarkup() {
        assertEquals(10, drumsticks.calculateMarkup(),0.0);
    }
}
