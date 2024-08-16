public class CheckingAccount extends BankAccount{ 
    protected double interestRate;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID); 
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) { 
        this.interestRate = interestRate;
    }
    public double getInterestRate() { 
        return interestRate;
    }

    @Override
    public void withdrawal(double withdrawalAmount) {
        super.withdrawal(withdrawalAmount);
        processWithdrawal();
    }

    public void processWithdrawal() { 
        if (getBalance() < 0){
            System.out.println("Account has surpassed zero dollars, $30 overdraft fee has been applied.");
        }
    }

    public void displayAccount() { 
        accountSummary();
        System.out.println("Interest Rate: " + interestRate);
    }
}