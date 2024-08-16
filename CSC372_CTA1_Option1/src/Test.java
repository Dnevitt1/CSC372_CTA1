public class Test {
    public static void main(String[] args) {
        //test bank account functionality
        BankAccount bankAccount = new BankAccount("Dallas", "Nevitt", 666420);
        bankAccount.deposit(500);
        bankAccount.withdrawal(200);

        //test checking account functionality
        CheckingAccount  checkingAccount = new CheckingAccount("Dallas", "Nevitt", 666420, 3.5);
        checkingAccount.deposit(500);
        checkingAccount.withdrawal(700);
        checkingAccount.displayAccount();
    }
}
