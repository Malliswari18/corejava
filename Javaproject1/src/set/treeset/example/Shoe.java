package set.treeset.example;

public class Shoe implements Comparable<Shoe> {

    String brand;
    Double price;
    String color;
    int size;

    public Shoe(String brand, double price, String color, int size) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    /* Default sorting based on brand */
    @Override
    public int compareTo(Shoe existingElement) {
        return this.brand.compareTo(existingElement.brand);
    }

    @Override
    public String toString() {
        return "Shoe [brand=" + brand +
               ", price=" + price +
               ", color=" + color +
               ", size=" + size + "]";
    }
}