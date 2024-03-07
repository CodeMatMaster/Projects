
public class SavingsAccount extends Account
{
        private double interestRate;

        public SavingsAccount(double initBalance, double initRate)
        {
                super(initBalance);
                this.interestRate = initRate;
        }

        public double getInterestRate()
        {
                return interestRate;
        }
}
