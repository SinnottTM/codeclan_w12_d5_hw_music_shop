import musicShop.instruments.InstrumentType;
import musicShop.instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before() {
        keyboard = new Keyboard(InstrumentType.ELECTRIC, 80.00, 100.00, "white", 50);
    }

    @Test
    public void keyboardHasType() {
        assertEquals(InstrumentType.ELECTRIC, keyboard.getInstrumentType());
    }

    @Test
    public void keyboardHasBuyPrice() {
        assertEquals(80.00, keyboard.getBuyPrice(), 0.0);
    }

    @Test
    public void keyboardHasSellPrice() {
        assertEquals(100.00, keyboard.getSellPrice(), 0.0);
    }

    @Test
    public void keyboardHasColour() {
        assertEquals("white", keyboard.getColour());
    }

    @Test
    public void keyboardHasKeys() {
        assertEquals(50, keyboard.getKeys());
    }

    @Test
    public void keyboardCanPlay() {
        assertEquals("dee-daa-dum", keyboard.play());
    }

    @Test
    public void keyboardMarkup() {
        assertEquals(20, keyboard.calculateMarkup(),0.0);
    }
}
