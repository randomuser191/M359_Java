package U3.Examples;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza cheese = new Pizza("Dominoes", 6, false);
        Pizza pepperoni = new Pizza("Pizza Hut", 6, 5, true);

        System.out.println(cheese.getNumToppings());
        System.out.println(cheese.isDeepDish());
        System.out.println(pepperoni.getNumToppings());
        System.out.println(pepperoni.getStore());
        System.out.println('test edit');

        cheese.setStore("Pizza Hut");
        cheese.setInches(3);
        cheese.setDeepDish(true);
        cheese.setNumToppings(3);
        System.out.println(cheese.getInches());
        System.out.println(cheese.isDeepDish());
        System.out.println(cheese.getNumToppings());
    }
}