public class oops{
    static class BankAccount{
        //properties or attributes which we define to a class
        public String accountHolderName;
        public int accountNumber;
        private double balance;//here we are able to acces balance variable as all thefunction is written in the same class
        protected String accountType;

        //constructor which is used to initialize the properties of a class
        public BankAccount(String name,int number,double initialBalance,String type){
            this.accountHolderName=name;
            this.accountNumber=number;
            this.balance=initialBalance;
            this.accountType=type;
        }

        //methods or functions which we define in a class
        public void deposit(double amount){
            if(amount>0){
                balance=balance+amount;
                System.out.println("Deposited:"+amount);
            }else{
                System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
            System.out.println("you withdrawn:"+amount +"Avialable balance:"+balance);
        }
    }

    public double getBalance(){
        return balance;
    }
}

 static class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String name,int number,double balance,double rate){
        super(name,number,balance,"Savings");//here savings is the account type
        this.interestRate=rate;
    }

    public void addInterest(){
        double interest=getBalance() * interestRate/100;
        deposit(interest);
        System.out.println("Interest of " + interest + " added!");
    }
}

public static void main(String args[]){
    BankAccount myAccount=new BankAccount("Aniket",7088678,1000.00,"Current");
   System.out.println("Account Holder:"+myAccount.accountHolderName);

   System.out.println("Initial Balance"+myAccount.getBalance());

   myAccount.deposit(1000);
   System.out.println("Balance after deposit: " + myAccount.getBalance());

   myAccount.withdraw(500);
    System.out.println("Balance after withdrawal: " + myAccount.getBalance());

    
}
}