package Challenges78.Packages;

public class Customer {

    public  static void  main(String[] args){
        BankAccount account = new BankAccount("001","Arpit Tomar");
        account.depositMoney(300);
        System.out.println(account.withDrawMoney(100));
        account.depositMoney(-50);
        account.withDrawMoney(0);
    }

}
