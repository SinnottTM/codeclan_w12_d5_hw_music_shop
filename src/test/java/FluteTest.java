import musicShop.instruments.Flute;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(InstrumentType.WOODWIND, 20.00, 40.00, "brown",20);
    }

    @Test
    public void fluteHasType() {
        assertEquals(InstrumentType.WOODWIND, flute.getInstrumentType());
    }

    @Test
    public void fluteHasBuyPrice() {
        assertEquals(20.00, flute.getBuyPrice(), 0.0);
    }

    @Test
    public void fluteHasSellPrice() {
        assertEquals(40.00, flute.getSellPrice(), 0.0);
    }

    @Test
    public void fluteHasColour() {
        assertEquals("brown", flute.getColour());
    }

    @Test
    public void fluteHasHoles() {
        assertEquals(20, flute.getHoles());
    }

    @Test
    public void fluteCanPlay() {
        assertEquals("tootle-too", flute.play());
    }

    @Test
    public void fluteMarkup() {
        assertEquals(20, flute.calculateMarkup(),0.0);
    }
}
