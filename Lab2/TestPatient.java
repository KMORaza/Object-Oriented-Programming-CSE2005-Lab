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
public class TestPatient {
    public static void main(String[] args) {
        // Test default constructor
        Patient defaultPatient = new Patient();
        System.out.println("Default Patient Data:");
        displayPatientData(defaultPatient);
        // Test overloaded constructor
        Patient customPatient = new Patient(12345, 25, "B", '+');
        System.out.println("\nCustom Patient Data:");
        displayPatientData(customPatient);
        // Test getter methods
        System.out.println("\nPatient ID: " + defaultPatient.getIdNumber());
        System.out.println("Patient Age: " + defaultPatient.getAge());
        System.out.println("Blood Type: " + defaultPatient.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + defaultPatient.getBloodData().getRhFactor());
    }
    // Method to display Patient Data
    public static void displayPatientData(Patient patient) {
        System.out.println("Patient ID: " + patient.getIdNumber());
        System.out.println("Patient Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient.getBloodData().getRhFactor());
    }
}
/*
OUTPUT :-
Default Patient Data:
Patient ID: 0
Patient Age: 0
Blood Type: O
Rh Factor: +

Custom Patient Data:
Patient ID: 12345
Patient Age: 25
Blood Type: B
Rh Factor: +

Patient ID: 0
Patient Age: 0
Blood Type: O
Rh Factor: +
 */