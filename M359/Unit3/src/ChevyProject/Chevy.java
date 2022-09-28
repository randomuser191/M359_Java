package ChevyProject;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double priceWUpgrades;
    private double total;
    private String model;
    private String color;
    private boolean luxPkg;
    private boolean fwdPkg;
    private boolean spPkg;
    final String MAKE = "Chevrolet";
    final double TAX_RATE = .122;
    final double LUX_PKG_COST = .2;
    final int FWD_PKG_COST = 3500;
    final double SP_PKG_COST = .15;


    public Chevy(int y, int m, double f, double b, String mod, String col, boolean lux, boolean fwd, boolean sp){
        year = y;
        mileage = m;
        fuelEfficiency = f;
        basePrice = b;
        model = mod;
        color = col;
        luxPkg = lux;
        fwdPkg = fwd;
        spPkg = sp;
        priceWUpgrades = b;
        total = b;
        calcPrice();
    }
    public Chevy(){
        year = 2021;
        color = "White";
        model = "Trax";
        mileage = 0;
        basePrice = 16000;
        fuelEfficiency = 35;
        luxPkg = false;
        spPkg = false;
        fwdPkg = false;
        priceWUpgrades = 0;
        total = basePrice;
        calcPrice();
    }
    public int compareTo(Chevy other){
        return mileage - other.mileage;
    }
    public boolean equals(Chevy other){
        if(color.equals(other.color) && model.equals(other.model)){
            if(mileage <= 200 && other.mileage <= 200 || mileage >= 200 && other.mileage >= 200){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String str = "**************************************************\n";
        str += year + " " +  MAKE + " " + "(" + color + ")\n";
        str += "\tBASE PRICE:\t\t\t\t\t$" + basePrice;
        str += "\n\tMILES:\t\t\t\t\t\t" + mileage;
        str += "\n\tFUEL EFFICIENCY:\t\t\t" + fuelEfficiency + "mpg";
        str += "\n\tPACKAGES:\n";

        if(luxPkg){
            str+= "\t\t- Luxury Package\n";
        }
        if(fwdPkg){
            str+= "\t\t- 4WD Package\n";
        }
        if(spPkg){
            str+= "\t\t- Sport Package\n";
        }
        if(!luxPkg && !spPkg && !fwdPkg){
            str += "\t\t- None";
        }
        str += "\n\n\tPRICE WITH UPGRADES:\t\t$" + priceWUpgrades;
        str += "\n\tFINAL PRICE WITH TAX:\t\t$" + total;
        str += "\n**************************************************";
        return str;
    }
    public void calcPrice(){
        priceWUpgrades = basePrice;
        if(luxPkg){
            priceWUpgrades += (priceWUpgrades * LUX_PKG_COST);
        }
        if(fwdPkg){
            priceWUpgrades += FWD_PKG_COST;
        }
        if(spPkg){
            priceWUpgrades += (priceWUpgrades * SP_PKG_COST);
            fuelEfficiency *= .8;
        }

        total = priceWUpgrades + (priceWUpgrades * TAX_RATE);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPriceWUpgrades() {
        return priceWUpgrades;
    }

    public void setPriceWUpgrades(double priceWUpgrades) {
        this.priceWUpgrades = priceWUpgrades;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxPkg() {
        return luxPkg;
    }

    public void setLuxPkg(boolean luxPkg) {
        this.luxPkg = luxPkg;
    }

    public boolean isFwdPkg() {
        return fwdPkg;
    }

    public void setFwdPkg(boolean fwdPkg) {
        this.fwdPkg = fwdPkg;
    }

    public boolean isSpPkg() {
        return spPkg;
    }

    public void setSpPkg(boolean spPkg) {
        this.spPkg = spPkg;
    }
}
