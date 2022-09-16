package Unit2.Examples;

public class Phone {
    private String brand;
    private int storage;
    private boolean hasService;

    public Phone (String b, int s, boolean h){
        brand = b;
        storage = s;

        hasService = h;
    }

    public Phone (String b, int s){
        brand = b;
        storage = s;
        hasService = true;
    }

    public void turnOffService() {
        hasService = false;
    }
    public void turnOnService(){
        hasService = true;
    }
    public void printPhoneDetails(){
        System.out.println(" Brand: " + brand + "\n Storage: " + storage + "Gb" + "\n Has Service: " + hasService + '\n');
    }
    public String getBrand(){
        return brand;
    }
    public boolean getService(){
        return hasService;
    }
    public int getStorage(){
        return storage;
    }
    public void setBrand(String b){
        brand = b;
    }
    public void setService(boolean s){
        hasService = s;
    }
    public void setStorage(int s){
        storage = s;
    }
}
