package Examples.HeroVillainExample;

public class Villain {
    private String name;
    private Power superPower;
    private static int totalVillainStrength = 0;
    private static int numVillains = 0;
    public Villain(String n, Power s){
        name = n;
        superPower = s;
        numVillains++;
        totalVillainStrength += s.getStrength();
    }
    public Villain(String n, String p, int s){
        name = n;
        superPower = new Power(p, s);
        numVillains++;
        totalVillainStrength += s;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static int getTotalVillainStrength(){
        return totalVillainStrength;
    }
    public static int getNumVillains(){
        return numVillains;
    }
    public Power getSuperPower() {
        return superPower;
    }
    public String toString(){
        String str = "This villian is named " + name + "\n";
        str += superPower.toString();

        return str;
    }
    public void updateStrength(double loss){
        totalVillainStrength -= (int)(superPower.getStrength() * (1 - loss));
        superPower.setStrength((int)(superPower.getStrength() * loss));
    }
    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
