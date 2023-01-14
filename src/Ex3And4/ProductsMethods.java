package Ex3And4;

public class ProductsMethods {
    public static void main(String[] args) {
        Product firstProduct = new Product("Car", 20000, 15, "Mobility");
        Product secondProduct = new Product("Motorcycle", 8000, 0, "Mobility");
        Product thirdProduct = new Product("Ball", 15, 100, "Sports");

        System.out.printf("The first product is a %s (%s category), with a price of %d and %d in stock.\n",
                firstProduct.getName(), firstProduct.getCategory(), firstProduct.getPrice(), firstProduct.getQuantity());
        System.out.printf("The second product is a %s (%s category), with a price of %d and %d in stock.\n",
                secondProduct.getName(), secondProduct.getCategory(), secondProduct.getPrice(), secondProduct.getQuantity());
        System.out.printf("The third product is a %s (%s category), with a price of %d and %d in stock.\n",
                thirdProduct.getName(), thirdProduct.getCategory(), thirdProduct.getPrice(), thirdProduct.getQuantity());

        System.out.println("The first product is in stock: " + firstProduct.hasStock());
        System.out.println("The second product is in stock: " + secondProduct.hasStock());
        System.out.println("The third product is in stock: " + thirdProduct.hasStock());

        System.out.printf("The %s is part of the mobility category: %s \n", firstProduct.getName(), firstProduct.isCategory("Mobility"));
        System.out.printf("The %s is part of the mobility category: %s \n", secondProduct.getName(), secondProduct.isCategory("Mobility"));
        System.out.printf("The %s is part of the mobility category: %s \n", thirdProduct.getName(), thirdProduct.isCategory("Mobility"));
    }
}
