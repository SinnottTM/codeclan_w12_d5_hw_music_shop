import musicShop.instruments.Guitar;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRING, 100.00, 200.00, "black", 6, 2);
    }

    @Test
    public void guitarHasType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void guitarHasBuyPrice() {
        assertEquals(100.00, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void guitarHasSellPrice() {
        assertEquals(200.00, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void guitarHasColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void guitarHasStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void guitarHasPickups() {
        assertEquals(2, guitar.getPickups());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("strum-strum", guitar.play());
    }

    @Test
    public void guitarMarkup() {
        assertEquals(100, guitar.calculateMarkup(),0.0);
    }
}
