public class Bank_Account {

    int ACC_No;
    String Acc_Holder_Name;
    double Acc_Balance;

    // Constructor
    Bank_Account(int ACC_No, String Acc_Holder_Name, double Acc_Balance) {
        this.ACC_No = ACC_No;
        this.Acc_Holder_Name = Acc_Holder_Name;
        this.Acc_Balance = Acc_Balance;
    }

    // Deposit method
    void Deposit(double amount) {
        Acc_Balance += amount;
    }

    // Withdraw method
    void Withdraw(double amount) {
        if (Acc_Balance >= amount) {
            Acc_Balance -= amount;
        } else {
            System.out.println("Insufficient Balance!!");
        }
    }

    // Display method
    void Display() {
        System.out.println("---------Account Information--------");
        System.out.println("Account Holder Name: " + Acc_Holder_Name);
        System.out.println("Account Number: " + ACC_No);
        System.out.println("Account Balance: " + Acc_Balance);
    }

    // Main method
    public static void main(String[] args) {
        // Create an object with a double for the Acc_Balance
        Bank_Account obj = new Bank_Account(12345, "Tushar Pawar", 1000.00);

        // Deposit some money
        obj.Deposit(500);

        // Withdraw some money
        obj.Withdraw(500);

        // Display account information
        obj.Display();
    }
}
