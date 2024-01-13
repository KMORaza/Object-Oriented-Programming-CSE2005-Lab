package Lab1;
/*
Q6]
(b)
Create a class named TestLease whose main() method declares four Lease objects.
Call a getData() method three times. Within the method, prompt a user for values for each field for a Lease, and return a Lease object to the main() method where it is assigned to one of main()’s Lease objects.
Do not prompt the user for values for the fourth Lease object, but let it continue to hold the default values.
Then, in main(), pass one of the Lease objects to a showValues() method that displays the data.
Then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed.
Next, call the showValues() method for the Lease object again and confirm that the pet fee has been added to the rent.
Finally, call the showValues() method with each of the other three objects; confirm that two hold the values you supplied as input and one holds the constructor default values.
Save the application as TestLease.java
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
import java.util.Scanner;
public class TestLease {
    public static void main(String[] args) {
        // Declare four Lease objects
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease(); // Default values will be retained
        // Call getData() method three times
        getData(lease1);
        getData(lease2);
        getData(lease3);
        // Display data for one of the Lease objects
        System.out.println("\nDisplaying Lease Data Before Adding Pet Fee:");
        showValues(lease1);
        // Call addPetFee() method and display the explanation statement
        lease1.addPetFee();
        // Display data for the Lease object again (after adding pet fee)
        System.out.println("\nDisplaying Lease Data After Adding Pet Fee:");
        showValues(lease1);
        // Display data for the other three Lease objects
        System.out.println("\nDisplaying Lease Data for Other Objects:");
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }
    // Method to prompt user for values and return a Lease object
    public static Lease getData(Lease lease) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tenant name for Lease: ");
        lease.setTenantName(scanner.nextLine());
        System.out.print("Enter apartment number for Lease: ");
        lease.setApartmentNumber(scanner.nextInt());
        System.out.print("Enter monthly rent for Lease: $");
        lease.setMonthlyRent(scanner.nextDouble());
        System.out.print("Enter lease term in months for Lease: ");
        lease.setLeaseTerm(scanner.nextInt());
        return lease;
    }
    // Method to display Lease data
    public static void showValues(Lease lease) {
        System.out.println("\nLease Details:");
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}
/*
Enter tenant name for Lease: YourName
Enter apartment number for Lease: 13
Enter monthly rent for Lease: $50
Enter lease term in months for Lease: 3
Enter tenant name for Lease: YourName2
Enter apartment number for Lease: 15
Enter monthly rent for Lease: $45
Enter lease term in months for Lease: 4
Enter tenant name for Lease: YourName3
Enter apartment number for Lease: 17
Enter monthly rent for Lease: $60
Enter lease term in months for Lease: 6

Displaying Lease Data Before Adding Pet Fee:

Lease Details:
Tenant Name: YourName
Apartment Number: 13
Monthly Rent: $50.0
Lease Term: 3 months
Pet fee of $10.0 added to the monthly rent.
Please note the pet policy: No aggressive breeds allowed.

Displaying Lease Data After Adding Pet Fee:

Lease Details:
Tenant Name: YourName
Apartment Number: 13
Monthly Rent: $60.0
Lease Term: 3 months

Displaying Lease Data for Other Objects:

Lease Details:
Tenant Name: YourName2
Apartment Number: 15
Monthly Rent: $45.0
Lease Term: 4 months

Lease Details:
Tenant Name: YourName3
Apartment Number: 17
Monthly Rent: $60.0
Lease Term: 6 months

Lease Details:
Tenant Name: XXX
Apartment Number: 0
Monthly Rent: $1000.0
Lease Term: 12 months
*/