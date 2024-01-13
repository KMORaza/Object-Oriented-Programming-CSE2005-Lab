package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public abstract class PhoneCall {
    private String phoneNumber;
    private double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}
