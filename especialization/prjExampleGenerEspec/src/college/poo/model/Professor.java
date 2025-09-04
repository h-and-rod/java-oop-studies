package college.poo.model;

/**
 *
 * @h-and-rod 
 */

public class Professor extends Person {
    
    private int employeeId;
    private double salary;
    
    public Professor(int employId, String nm, String bd) {
        super(nm, bd);
        employeeId = employId;
    }
    
    public void setSalary(double sal) {
        salary = sal;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public double getSalary() {
        return salary;
    }
}
