package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class BusinessLoan extends Loan {
    public BusinessLoan (int num, String name, double amt, int yrs, double prime) {
        super(num, name, amt, yrs);
        rate = prime + 0.01;
}}