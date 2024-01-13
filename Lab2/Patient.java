package Lab2;
/*
Q2] (b)
Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to O and +.
Create an overloaded constructor that provides values for each field. Also provide get methods for each field.
Save the file as Patient.java.
Create an application that demonstrates that each method works correctly, and save it as TestPatient.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
public class Patient {
    // Fields
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        // Set default values
        this.idNumber = 0;
        this.age = 0;
        this.bloodData = new BloodData(); // Use default BloodData constructor
    }
    // Overloaded constructor
    public Patient(int idNumber, int age, String bloodType, char rhFactor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }
    // Getter methods
    public int getIdNumber() {
        return idNumber;
    }
    public int getAge() {
        return age;
    }
    public BloodData getBloodData() {
        return bloodData;
    }
}
