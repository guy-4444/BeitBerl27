import homework3.BankAccount;
import homework3.Bank;

public class Main
{
    public static void main(String[] args)
    {
        BankAccount a,b,c;
        a = new BankAccount("Yotam", 999999999);
        b = new BankAccount("Eyal", 1);
        System.out.println(a.getAccountId() + " " + b.getAccountId());
        b.deposit(500);
        a.withdraw(200);
        a.transferTo(b,300);
        System.out.println(b.getBalance());
        b.withdraw(9000);
        System.out.println(b.getBalance());
        System.out.println(a.getAccountInfo() + " " + b.getAccountInfo());
        System.out.println(homework3.BankAccount.getTotalAccounts());
        System.out.println(homework3.BankAccount.getNextAccountId());
        c = new BankAccount("Omer", 7);
        System.out.println(c.getAccountId());
        b.deposit(-2);
        b.transferTo(b,300);
        System.out.println(b.getAccountInfo());
        Bank leumi = new Bank("leumi", 7);
        leumi.setAccounts(a,b);
        System.out.println(leumi.getTotalBalance());
        System.out.println(leumi.getBankInfo());
    }
}
