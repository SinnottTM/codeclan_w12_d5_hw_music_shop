package musicShop.nonInstruments;

public class Drumsticks extends SalesLogic {

    private String material;
    private double length;

    public Drumsticks(String description, double buyPrice, double sellPrice, String material, double length) {
        super(description, buyPrice, sellPrice);
        this.material = material;
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
