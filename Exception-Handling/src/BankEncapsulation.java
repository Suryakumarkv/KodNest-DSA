public class BankEncapsulation {

    private double balance;

    public void deposite(double amount) {
        if(amount > 0) {
            balance += amount;
//            Transaction(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

//    private void Transaction(double amount) {
//        System.out.println("Transaction Started" + amount);
//    }

    public static void main(String[] args) {
        BankEncapsulation obj = new BankEncapsulation();
        obj.deposite(50);
        System.out.println("The balance is " + obj.getBalance());
    }
}
