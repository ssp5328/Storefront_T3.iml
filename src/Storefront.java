public class Storefront {
    static String storename;
    public static void main(String[] args) {
        storename ="T3 Jewelery Store!";
        //Name of class          Default Constructor
        Store jeweleryStore = new Store();
        //set store name
        jeweleryStore.setStorename(storename);
        System.out.println(jeweleryStore.getStorename());

        System.out.println("");

        //Display Bracelet
        Bracelet bracelet =  new Bracelet(100);
        System.out.println(bracelet.toString());

        Ring ring = new Ring(75);
        System.out.println(ring.toString());

        Earring earring = new Earring(90);
        System.out.println(earring.toString());

        System.out.println("Tax: "+Sale.getTax(100,StateCode.PA));



    }
}