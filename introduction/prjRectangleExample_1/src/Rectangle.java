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

    public double getHeight() {
        return height;
    }
    
    public void setWidth(Double w){
        width = w;
    }

    public double getWidth() {
        return width;
    }
    
    public double calcArea(){
        return (width * height);
    }

    public double calcPerimeter(){
        return (2 * (width + height));
    }
    
    public double calcDiagonal(){
        double diagonal;
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        
        return diagonal;
    }
}
