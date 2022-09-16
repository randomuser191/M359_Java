package Unit2.Examples;

public class RectangleDriver {
    // We need to make a main method so we can create Rectangle objects

    public static void main(String[] args){
        //to create an object we need to use the following structure
        //ClassName varName = new Classname(...parameters...);

        Rectangle rect1 = new Rectangle(2, 5);

        //Actual param is 6
        //Formal param is side
        Rectangle rect2 = new Rectangle(6);

        //to call methods, use dot notation structure
        //varName.methodName
        rect1.printArea();
        rect1.printPerimeter();
        rect2.printArea();
        rect2.printPerimeter();
    }
}
