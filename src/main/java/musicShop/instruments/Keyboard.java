package musicShop.instruments;

public class Keyboard extends Instrument {

    private int keys;

    public Keyboard(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, int keys) {
        super(instrumentType, buyPrice, sellPrice, colour);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String play() {
        return "dee-daa-dum";
    }
}
