public class Earring extends Item {
    private int amt;
    public Earring(int amt) {
        super("Ring",String.format("A pair of earrings to decorate the ears.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}