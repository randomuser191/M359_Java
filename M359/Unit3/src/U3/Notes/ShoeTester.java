package U3.Notes;

public class ShoeTester {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Adidas", "Blue", 11.5, 60);
        Shoe shoe2 = new Shoe("Adidas", "Blue", 11.5, 50.75);
        System.out.println(shoe1.equals(shoe2));
        System.out.println(shoe1.compareTo(shoe2));
    }
}
