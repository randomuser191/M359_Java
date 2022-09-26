package U3.Notes;

public class Shoe {
    private String brand;
    private String style;
    private double size;
    private double price;

    public Shoe(String b, String s, double si, double pr){
        brand = b;
        style = s;
        size = si;
        price = pr;
    }
    public boolean equals(Shoe other){
        return (other.brand.equals(brand) && other.style.equals(style));
    }
    public int compareTo(Shoe other){
        double diff = price - other.price;
        if(diff < 0){
            return -1;
        }else if(diff > 0 && diff > 1){
            return 1;
        }else {
            return (int) (diff);
        }
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
