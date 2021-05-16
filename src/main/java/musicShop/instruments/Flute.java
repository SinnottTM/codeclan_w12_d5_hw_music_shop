package musicShop.instruments;

public class Flute extends Instrument {

    private int holes;

    public Flute(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, int holes) {
        super(instrumentType, buyPrice, sellPrice, colour);
        this.holes = holes;
    }

    public int getHoles() {
        return holes;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }

    public String play() {
        return "tootle-too";
    }
}
