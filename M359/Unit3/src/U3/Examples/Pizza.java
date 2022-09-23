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

    /**
     * toString method always has toString()
     * creates string and returns it
     * prints object
     * @return string
     */
    public String toString(){
        String str = "";
        str += "My pizza is from " + store + ". It is " + inches + " inches. \n";
        if(isDeepDish){
            str+= "I love deep dish. ";
        }else{
            str += "Thin crust is the way to go.";
        }
        if(numToppings == 0){
            str+= "\nI love cheese pizza.";
        }else{
            str+= "\nMy pizza has " + numToppings + " toppings. \n";
        }
        return str;
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
    public String comparePizza(Pizza other){
        int sizeDiff = this.inches - other.inches;
        int toppingsDiff = this.numToppings - other.numToppings;
        if(sizeDiff != 0){
            return "Difference in Inches: " + Math.abs(sizeDiff) + " inches";
        }
        if(toppingsDiff != 0){
            return "Difference in number of toppings: " + Math.abs(toppingsDiff) + " toppings";
        }else{
            return "Same Pizza";
        }
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
