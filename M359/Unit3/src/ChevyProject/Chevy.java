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
        priceWUpgrades = 0;
        total = b;
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
    }

}
