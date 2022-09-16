package U3.Examples;

//Code -> Generate ->  Generate code

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String s, int i, int n, boolean d){
        store = s;
        inches = i;
        numToppings = n;
        isDeepDish = d;
    }
    public Pizza(String s, int i, boolean d){
        store = s;
        inches = i;
        numToppings = 0;
        isDeepDish = d;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String s) {
        store = s;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int i) {
        inches = i;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int n) {
        numToppings = n;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}
