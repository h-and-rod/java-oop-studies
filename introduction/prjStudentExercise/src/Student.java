/**
 *
 * @author h-and-rod
 */

public class Student {
    
    private int RA;
    private double Tst1Gd;
    private double Tst2Gd;
    private double Prj1Gd;
    private double Prj2Gd;

    public void setRA(int ra) {
        RA = ra;
    }

    public void setTst1Gd(double grade){
        Tst1Gd = grade;
    }

    public void setTst2Gd(double grade){
        Tst2Gd = grade;
    }

    public void setPrj1Gd(double grade){
        Prj1Gd = grade;
    }

    public void setPrj2Gd(double grade){
        Prj2Gd = grade;
    }

    public int getRA() {
        return RA;
    }

    public double getTst1Gd() {
        return Tst1Gd;
    }

    public double getTst2Gd() {
        return Tst2Gd;
    }

    public double getPrj1Gd() {
        return Prj1Gd;
    }

    public double getPrj2Gd() {
        return Prj2Gd;
    }

    public double calcTstAverage() {
        double average;

        average = 0.75 * ((Tst1Gd + 2 * Tst2Gd)/3);

        return average;
    }
    
    public double calcPrjAverage() {
        double average;
    
        average = 0.25 * ((Prj1Gd + Prj2Gd)/2);
    
        return average;
    }
    
    public double calcFinalAverage() {
        double finalAverage;
    
        finalAverage = calcPrjAverage() + calcTstAverage();
    
        return finalAverage;
    }
    
    public boolean isApproved(){
        return (calcFinalAverage() >= 5);
    }

}
