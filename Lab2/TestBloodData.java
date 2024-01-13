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
public class TestBloodData {
    public static void main(String[] args) {
        // Test default constructor
        BloodData defaultBloodData = new BloodData();
        System.out.println("Default Blood Data:");
        displayBloodData(defaultBloodData);
        // Test overloaded constructor
        BloodData customBloodData = new BloodData("AB", '-');
        System.out.println("\nCustom Blood Data:");
        displayBloodData(customBloodData);
        // Test setter methods
        defaultBloodData.setBloodType("A");
        defaultBloodData.setRhFactor('-');
        System.out.println("\nUpdated Blood Data (using setter methods):");
        displayBloodData(defaultBloodData);
    }
    // Method to display Blood Data
    public static void displayBloodData(BloodData bloodData) {
        System.out.println("Blood Type: " + bloodData.getBloodType());
        System.out.println("Rh Factor: " + bloodData.getRhFactor());
    }
}
/*
OUTPUT :-
Default Blood Data:
Blood Type: O
Rh Factor: +

Custom Blood Data:
Blood Type: AB
Rh Factor: -

Updated Blood Data (using setter methods):
Blood Type: A
Rh Factor: -

*/