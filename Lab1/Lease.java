package Lab1;
/*
Q6]
(a)
Create a class named Lease with fields that hold an apartment tenant’s name, apartment number, monthly rent amount, and term of the lease in months.
Include a constructor that initializes the name to “XXX”, the apartment number to 0, the rent to 1000, and the term to 12.
Also include methods to get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee.
Save the class as Lease.java.
*/
// KHAN MOHD OWAIS RAZA
// 20BCD7138
// 25/11/2021
public class Lease {
    // Fields
    private String tenantName;
    private int apartmentNumber;
    private double monthlyRent;
    private int leaseTerm;
    // Constants
    private static final String DEFAULT_NAME = "XXX";
    private static final int DEFAULT_APARTMENT_NUMBER = 0;
    private static final double DEFAULT_MONTHLY_RENT = 1000.0;
    private static final int DEFAULT_LEASE_TERM = 12;
    private static final double PET_FEE = 10.0;
    // Constructor
    public Lease() {
        // Initialize fields in the constructor
        this.tenantName = DEFAULT_NAME;
        this.apartmentNumber = DEFAULT_APARTMENT_NUMBER;
        this.monthlyRent = DEFAULT_MONTHLY_RENT;
        this.leaseTerm = DEFAULT_LEASE_TERM;
    }
    // Getter and setter methods
    public String getTenantName() {
        return tenantName;
    }
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public double getMonthlyRent() {
        return monthlyRent;
    }
    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
    public int getLeaseTerm() {
        return leaseTerm;
    }
    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }
    // Method to add pet fee and explain pet policy
    public void addPetFee() {
        // Add pet fee to monthly rent
        monthlyRent += PET_FEE;
        // Call static method to explain pet policy
        explainPetPolicy();
    }
    // Static method to explain the pet policy
    public static void explainPetPolicy() {
        System.out.println("Pet fee of $" + PET_FEE + " added to the monthly rent.");
        System.out.println("Please note the pet policy: No aggressive breeds allowed.");
    }
}
