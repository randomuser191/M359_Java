package Examples.HeroVillainExample;

public class Power {
    private String name;
    private int strength;

    public Power(String str, int i){
        name = str;
        strength = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String toString() {
        return "The power is: " + name + " with a strength of: " + strength;
    }



}
