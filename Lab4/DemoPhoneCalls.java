package Lab4;
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingCall = new IncomingPhoneCall("123-456-7890");
        OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall("987-654-3210", 5);

        incomingCall.displayInfo();
        System.out.println();

        outgoingCall.displayInfo();
    }
}
