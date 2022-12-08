package Examples.HeroVillainExample;

public class SuperHero {
    private String name;
    private Power superPower;
    //Static needs to be initialized
    private static int numHeroes = 0;
    private static int totalHeroStrength = 0;

    public SuperHero(String n, Power s){
        name = n;
        superPower = s;
        numHeroes++;
        totalHeroStrength += s.getStrength();
    }
    public SuperHero(String n, String p, int s){
        name = n;
        superPower = new Power(p, s);
        numHeroes++;
        totalHeroStrength += s;
    }
    public String getName() {
        return name;
    }
    //Called by className.methodName (Superhero.getNumHeroes);
    public static int getNumHeroes(){
        return numHeroes;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void updateStrength(double loss){
        totalHeroStrength -= (int)(superPower.getStrength() * (1 - loss));
        superPower.setStrength((int)(superPower.getStrength() * loss));
    }
    public static int getTotalHeroStrength(){
        return totalHeroStrength;
    }
    public Power getSuperPower() {
        return superPower;
    }
    public String toString(){
        String str = "This superhero is named " + name + "\n";
        str += superPower.toString();

        return str;
    }
    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
