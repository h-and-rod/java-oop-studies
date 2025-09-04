package college.poo.model;

/**
 *
 * @author h-and-rod
 */

public class Person {
    // Superclass Person
    private String name;
    private String birthDate;

    public Person(String nm, String bd) {
        name = nm;
        birthDate = bd;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}

