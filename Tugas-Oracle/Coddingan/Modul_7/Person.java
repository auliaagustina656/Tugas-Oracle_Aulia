package Modul_7;

import java.util.Date;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstName, String middleName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getName() { return firstName + " " + middleName + " " + lastName; }
    public Date getDateOfBirth() { return dateOfBirth; }
}