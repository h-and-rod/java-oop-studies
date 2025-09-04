import college.poo.model.Student; //importa as coisas da classe Aluno - se faz necessário, pois 
                                    // o arquivo Aplic não está na mesma pasta que Aluno

import college.poo.model.Professor; //importa as coisas da classe Professor

/**
 *
 * @author h-and-rod
 */
public class Aplic {

    public static void main(String[] args) {

        Student studentObj = new Student(1010, "Carlos Silveira", "03/15/1978"); // instantiation of the student object
        studentObj.setTuition(1500);

        System.out.println("School registration: " + studentObj.getSchoolReg());
        System.out.println("Name: " + studentObj.getName());
        System.out.println("Birth date: " + studentObj.getBirthDate());
        System.out.println("Tuition: " + studentObj.getTuition());

        System.out.println("\n--------------------------------------------------\n");

        Professor professorObj = new Professor(15231, "Alessandro Almeida", "05/12/1960"); // instantiation of the professor object
        professorObj.setSalary(3500);

        System.out.println("Employee ID: " + professorObj.getEmployeeId());
        System.out.println("Name: " + professorObj.getName());
        System.out.println("Birth date: " + professorObj.getBirthDate());
        System.out.println("Salary: " + professorObj.getSalary());
    }
}
