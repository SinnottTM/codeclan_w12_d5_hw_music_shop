package musicShop.nonInstruments;

public class SheetMusic extends SalesLogic {

    private String title;
    private int pages;

    public SheetMusic(String description, double buyPrice, double sellPrice, int pages) {
        super(description, buyPrice, sellPrice);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
