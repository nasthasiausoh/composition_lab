package products;

public final class Product implements IProduct {
    private float price;  // these 3 properties are not important to implement the interface but we are going to be using getters and setters
    private long inventory;
    private String title;

    public Product(float price, long inventory, String title){
        this.price = price;
        this.inventory = inventory;
        this.title = title;
    }

    // Getters and setters

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public long getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(long inventory) {
        this.inventory = inventory;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {  // we could have made it 'newTitle' as that is what we did in the interface, but it does not really matter.
        this.title = title;
    }

    public void addInventory(long amount){
        this.inventory += amount;                    // we are increasing the amount from the inventory
    }

    public void removeInventory(long amount) {
        if(this.inventory - amount >= 0 ){            // if we have enough inventory
            this.inventory -= amount;                 // we are decreasing the amount from the inventory
        }
    }


}
