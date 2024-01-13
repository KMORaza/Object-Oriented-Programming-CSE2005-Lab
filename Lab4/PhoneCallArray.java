package Lab4;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class PhoneCallArray {
    public static void main(String[] args) {
        // Create an array of 8 PhoneCall objects
        PhoneCall[] phoneCalls = new PhoneCall[8];

        // Assign data to IncomingPhoneCall and OutgoingPhoneCall objects
        phoneCalls[0] = new IncomingPhoneCall("123-456-7890");
        phoneCalls[1] = new OutgoingPhoneCall("987-654-3210", 5);
        phoneCalls[2] = new IncomingPhoneCall("111-222-3333");
        phoneCalls[3] = new OutgoingPhoneCall("444-555-6666", 3);
        phoneCalls[4] = new IncomingPhoneCall("777-888-9999");
        phoneCalls[5] = new OutgoingPhoneCall("111-222-3333", 2);
        phoneCalls[6] = new IncomingPhoneCall("999-888-7777");
        phoneCalls[7] = new OutgoingPhoneCall("555-444-3333", 4);

        // Display data using a for loop
        for (PhoneCall call : phoneCalls) {
            call.displayInfo();
            System.out.println();
        }
    }
}
