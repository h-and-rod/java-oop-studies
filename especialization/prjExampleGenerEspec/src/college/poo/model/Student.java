package college.poo.model;

/**
 *
 * @author h-and-rod
 */

public class Student extends Person { // establishes inheritance link between class and subclass

    private int schoolReg;
    private double tuition;

    public Student(int sr, String n, String bd) {
        super(n, bd); // calls the constructor method inherited from the superclass

        schoolReg = sr;
    }

    public void setTuition(double t) {
        tuition = t;
    }

    public int getSchoolReg() {
        return schoolReg;
    }

    public double getTuition() {
        return tuition;
    }
}
