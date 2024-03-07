class CheckingAccount extends Account
{
        private double interestRate;
        private int numChecks;

        public CheckingAccount(double initBalance)
        {
                super(initBalance);
      //          this.interestRate = initRate;
                this.numChecks = 0;
        }

/*
        public double getInterestRate()
        {
                return interestRate;
        }

*/

        public int getChecksWritten()
        {
                return numChecks;
        }


        public void writeCheck(double amount) {
        super.withdraw(amount);
        numChecks++;
        }

}

