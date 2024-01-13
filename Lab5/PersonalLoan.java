package Lab5;
// KHAN MOHD OWAIS RAZA
// 20BCD7138
public class PersonalLoan extends Loan {
    public PersonalLoan(int num, String name, double amt, int yrs, double prime){
        super(num,name,amt,yrs);
        rate=prime+0.02;
    }
}
