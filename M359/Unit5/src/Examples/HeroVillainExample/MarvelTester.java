package Examples.HeroVillainExample;

import java.sql.SQLOutput;

public class MarvelTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart, Suit", 100);
        Villain thanos = new Villain("Thanos", "Snap", 150);
        SuperHero ironMan2 = new SuperHero("Iron Man2", "Rich, Smart, Suit", 100);
        Villain thanos2 = new Villain("Thanos2", "Snap", 150);
        epicBattle(ironMan, thanos, 5);
    }
    /**
     * Description: Simulates a battle between a superhero and a villain
     * Parameters: Accepts a SuperHero object and a Villain object
     **/
    public static String battle(SuperHero s, Villain v){
        //stronger has 75% chance
        //winner takes 10% damage
        //loser takes 35% damage
        String winner;
        if(s.getSuperPower().getStrength() == 0){
            winner = v.getName();
            return winner;
        } else if (v.getSuperPower().getStrength() == 0) {
            winner = s.getName();
            return winner;
        }
        int chance = (int)(Math.random() * 4 + 1);
        if(s.getSuperPower().getStrength() > v.getSuperPower().getStrength()){
            if(chance < 4){
                winner = s.getName();
                s.updateStrength(.9);
            }else{
                winner = v.getName();
                v.updateStrength(.65);
            }
        }else if(s.getSuperPower().getStrength() == v.getSuperPower().getStrength()){
            if(chance <= 2){
                winner = s.getName();
            }else{
                winner = v.getName();
            }
        }
        else{
            if(chance < 4){
                winner = v.getName();
            }else{
                winner = s.getName();
            }
        }
        if(winner.equals(s.getName())){
            s.updateStrength(.9);
            v.updateStrength(.65);
        }else{
            v.updateStrength(.9);
            s.updateStrength(.65);
        }
        return winner;
    }
    /**
     * @param s
     * @param v
     * @param rounds
     * Simulated battle between superhero and villain rounds number of times**/
    public static void epicBattle(SuperHero s, Villain v, int rounds){
        for(var i = 1; i <= rounds; i++){
            System.out.println("Round " + i + ": ");
            System.out.println("The winner is: " + battle(s, v));
            System.out.println(s.getName() + ": " + s.getSuperPower().getStrength());
            System.out.println(v.getName() + ": " + v.getSuperPower().getStrength());
            System.out.println("Total Hero Strength: " + SuperHero.getTotalHeroStrength());
            System.out.println("Total Villain Strength: " + Villain.getTotalVillainStrength());
            System.out.println("\n");
        }
    }
}






















