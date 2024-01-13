package Lab4;
public class OutgoingPhoneCall extends PhoneCall {
    private static final double RATE = 0.04;
    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(RATE * minutes);
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
        System.out.println("Outgoing Call Information:");
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Rate: $" + RATE + " per minute");
        System.out.println("Number of Minutes: " + minutes);
        System.out.println("Price: $" + getPrice());
    }
}
