package Challenges78.Packages;

 class BankAccount {
     private String accountNumber;
     private  String accountHolderName;
     private double balance;

     public BankAccount(String accountNumber, String accountHolderName) {
         this.accountNumber = accountNumber;
         this.accountHolderName = accountHolderName;
     }

     public  void depositMoney(double money){
         if (money<=0){
             System.out.println("invalid deposit ");
         }else {
             balance += money;
         }

         balance+= money;
     }

     public double withDrawMoney(double Money ){
         if (Money<=0) {
             System.out.println("Invalid WithDrwal");

         } else if (balance >=Money){
             balance -= Money;

         }else {
             Money = balance;
             balance = 0;
         }

         return  Money;
     }
}
