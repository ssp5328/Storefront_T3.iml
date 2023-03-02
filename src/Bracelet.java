public class Bracelet extends Item {
    private int amt;
    public Bracelet(int amt) {
        super("Bracelet",String.format("A bracelet, big enough to fit on a wrist.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}

