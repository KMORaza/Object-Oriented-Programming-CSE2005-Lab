package Lab2;
/*
Q2] (a)
Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields.
Include get and set methods for each field.
Save this file as BloodData.java.
Create an application named TestBloodData that demonstrates each method works correctly.
Save the application as TestBloodData.java.
 */
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 29/11/2021
public class BloodData {
    // Fields
    private String bloodType;
    private char rhFactor;

    // Default constructor
    public BloodData() {
        // Set default values to O and +
        this.bloodType = "O";
        this.rhFactor = '+';
    }

    // Overloaded constructor
    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // Getter and setter methods for bloodType
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Getter and setter methods for rhFactor
    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }
}
