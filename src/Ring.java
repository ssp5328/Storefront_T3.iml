public class Ring extends Item {
    private int amt;
    public Ring(int amt) {
        super("Ring",String.format("A ring to decorate the fingers.", String.valueOf(amt)), amt);
        this.amt = amt;
    }
}
