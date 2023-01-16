package ex5;

public class Drink {
    public static void main(String[] args) {
        Bottle myBottle = new Bottle(5, 3, false);

        System.out.println("The bottle in over filled: " + myBottle.overFilled());
        System.out.println("The available liquid is: " + myBottle.getAvailableLiquid());
        System.out.println("The empty capacity of the bottle is: " + myBottle.getEmptyCapacity());
        myBottle.openBottle();
        myBottle.closeBottle();

        myBottle.drinkFromBottle(2);

        myBottle.openBottle();
        myBottle.drinkFromBottle(4);

        myBottle.openBottle();

        myBottle.drinkFromBottle(2);
    }
}
