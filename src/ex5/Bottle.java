package ex5;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean overFilled() {
        return this.availableLiquid > this.totalCapacity;
    }

    public int getAvailableLiquid() {
        return this.availableLiquid;
    }

    public int getEmptyCapacity() {
        if (overFilled()) {
            return 0;
        } else {
            return (this.totalCapacity - this.availableLiquid);
        }
    }

    public void openBottle() {
        if (open){
            System.out.println("Bottle already opened");
        } else {
            setOpen(true);
            System.out.println("Bottle is opened");
        }
    }

    public void closeBottle() {
        if (!open){
            System.out.println("Bottle already closed");
        } else {
            setOpen(false);
            System.out.println("Bottle is closed");
        }
    }

    public void drinkFromBottle(int requestedQuantity){
        if (open){
            if (requestedQuantity < this.availableLiquid){
                this.availableLiquid = this.availableLiquid - requestedQuantity;
                System.out.printf("You drank %d and the left quantity is %d. \n", requestedQuantity, this.availableLiquid);
            } else {
                System.out.println("Requested quantity is not available!");
            }
        } else {
            System.out.println("You can't drink from a closed bottle!");
        }
    }
}
