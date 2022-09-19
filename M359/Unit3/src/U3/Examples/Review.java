package U3.Examples;

public class Review {
    private String revName;
    private String busName;
    private int rating;


    public Review(String rN, String b, int r){
        revName = rN;
        busName = b;
        rating = r;
    }
    public String toString(){
        String str = "";
        str = revName + ", " + busName + ", " + rating;
        if(rating == 1){
            str += "\n\t** Strongly Discouraged";
        }
        if(rating == 5){
            str += "\n\t** Highly Recommended";
        }
        str += "\n";
        return str;
    }
    public String getRevName() {
        return revName;
    }

    public void setRevName(String revName) {
        this.revName = revName;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
