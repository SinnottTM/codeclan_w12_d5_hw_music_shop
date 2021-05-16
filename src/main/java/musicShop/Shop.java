package musicShop;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<ISell> stock;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.stock = new ArrayList<ISell>();
    }

    public String getShopName() {
        return shopName;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        for (ISell stock : this.stock) {
            if (stock == item) {
                this.stock.remove(item);
                break;
            }
        }
    }

    public double totalPotentialProfit() {
        double potentialprofit = 0;
        for (ISell stock : this.stock) {
            potentialprofit += stock.calculateMarkup();
        }
        return potentialprofit;
    }

}
