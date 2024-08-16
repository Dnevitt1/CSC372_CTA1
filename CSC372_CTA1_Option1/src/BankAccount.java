public class BankAccount { 
protected String firstName;
protected String lastName;
protected int accountID;
protected double balance;

    //no arg constructor
    public BankAccount() { 
        this.firstName = "";
        this.lastName = ""; 
        this.accountID = 0;
        this.balance = 0.0;    
    }
    //parameterized constructor
    public BankAccount(String firstName, String lastName, int accountID) { 
        this.firstName = firstName;
        this.lastName = lastName; 
        this.accountID = accountID;
        this.balance = 0.0;    
    }

    public void setFirstName(String firstName) { 
        this.firstName = firstName;
    }
    public void setLastName(String lastName) { 
        this.lastName = lastName;
    }
    public void setAccountID(int accountID) { 
        this.accountID = accountID;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() { 
        return lastName;
    }
    public int getAccountID() { 
        return accountID;
    }
    public double getBalance() { 
        return balance;
    }

    public void deposit(double depositAmount) { 
        balance += depositAmount;
    }
    public void withdrawal(double withdrawalAmount) { 
        if (withdrawalAmount > balance){ 
            balance -= (withdrawalAmount + 30);
        }
        else{ 
            balance -= withdrawalAmount;
        }
    }

    public void accountSummary() { 
        System.out.println("First Name: " + firstName + ", Last Name: " + lastName
                + ", Account ID: " + accountID + ", Balance: " + balance); 
    }
}