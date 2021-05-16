package musicShop.instruments;

public class Guitar extends Instrument{

    private int strings;
    private int pickups;

    public Guitar(InstrumentType instrumentType, double buyPrice, double sellPrice, String colour, int strings, int pickups) {
        super(instrumentType, buyPrice, sellPrice, colour);
        this.strings = strings;
        this.pickups = pickups;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public int getPickups() {
        return pickups;
    }

    public void setPickups(int pickups) {
        this.pickups = pickups;
    }

    public String play() {
        return "strum-strum";
    }
}
