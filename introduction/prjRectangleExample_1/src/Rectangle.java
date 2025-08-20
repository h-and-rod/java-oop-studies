/**
 *
 * @author h-and-rod
 */

public class Rectangle {
    private double height;
    private double width;

    public void setHeight(Double h) {
        height = h;
    }

    public void setWidth(Double w){
        width = w;
    }

    public double calcArea(){
        return (width * height);
    }

    public double calcPerimeter(){
        return (2 * (width + height));
    }
}
