package OOBS;

class BankAccount {

    private long accountNo;
    private double balance;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmt) {
        if (depositAmt > 0) {
            balance += depositAmt;
            System.out.println("Rs." + depositAmt + " credited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withdrawAmt) {
        if (withdrawAmt > 0 && withdrawAmt <= balance) {
            balance -= withdrawAmt;
            System.out.println("Rs." + withdrawAmt + " debited successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (getBalance() * interestRate) / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest added: Rs." + interest);
    }
}

class SalaryAccount extends BankAccount {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void creditSalary() {
        setBalance(getBalance() + monthlySalary);
        System.out.println("Salary credited: Rs." + monthlySalary);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNo(1001);
        sa.setBalance(5000);
        sa.setInterestRate(5);

        sa.deposit(1000);
        sa.addInterest();
        sa.withdraw(2000);

        System.out.println("Final SavingsAccount Balance: " + sa.getBalance());

        System.out.println("==================");
        SalaryAccount salAcc = new SalaryAccount();
        salAcc.setAccountNo(2001);
        salAcc.setBalance(1000);
        salAcc.setMonthlySalary(30000);

        salAcc.creditSalary();
        salAcc.withdraw(5000);

        System.out.println("Final SalaryAccount Balance: " + salAcc.getBalance());
    }
}
