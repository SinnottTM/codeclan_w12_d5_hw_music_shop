import musicShop.nonInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Rock Music Songs Vol 4", 20, 30, 50);
    }

    @Test
    public void sheetMusicHasDesc() {
        assertEquals("Rock Music Songs Vol 4", sheetMusic.getDescription());
    }

    @Test
    public void sheetMusicHasBuyPrice() {
        assertEquals(20, sheetMusic.getBuyPrice(), 0.0);
    }

    @Test
    public void sheetMusicHasSellPrice() {
        assertEquals(30, sheetMusic.getSellPrice(), 0.0);
    }

    @Test
    public void sheetMusicHasPages() {
        assertEquals(50, sheetMusic.getPages());
    }

    @Test
    public void sheetMusicMarkup() {
        assertEquals(10, sheetMusic.calculateMarkup(),0.0);
    }
}
