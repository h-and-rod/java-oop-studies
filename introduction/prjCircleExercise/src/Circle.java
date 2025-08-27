/**
 *
 * @author h-and-rod
 */

public class Circle {
    private double radius;
    
    public void setRad(double rad){
        radius = rad;       
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double calcPerimeter(){
        return (2 * 3.14 * radius);
    }
    
    public double calcArea(){
        return (3.14 * Math.pow(radius, 2));
    }
    
    public double calcDiameter(){
        return (2 * radius);
    }
    
}
