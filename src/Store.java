public class Store {
    private String storename;
    // Default Constructor
    public Store() {}

    // New constructor
    public Store(String newStoreName){

        storename = newStoreName;
    }
    // int constructor
    private int storeIdentifier;

    public Store(int storeID, String newStoreName){
        storename = newStoreName;
        storeIdentifier = storeID;
    }

    // getter and setter
    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }
    public int getStoreidentifier() {
        return storeIdentifier;
    }

    public void setStoreidentifier(int storeidentifier) {
        this.storeIdentifier = storeidentifier;
    }


    // new method
    public void getFullInfo(){
        System.out.println( storename + " " + "ID: " + storeIdentifier);

    }
}