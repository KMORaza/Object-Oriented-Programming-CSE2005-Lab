package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class IncomingPhoneCall extends PhoneCall {
    private static final double RATE = 0.02;

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(RATE);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void displayInfo() {
        System.out.println("Incoming Call Information:");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate: $" + RATE + " per call");
        System.out.println("Price: $" + getPrice());
    }
}
