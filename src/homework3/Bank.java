package homework3;

public class Bank
{
    private String bankName;
    private int bankCode;
    private BankAccount a;
    private BankAccount b;

    public Bank(String bankName, int bankCode)
    {
        this.bankCode = bankCode;
        this.bankName = bankName;
    }

    public void setAccounts(BankAccount a, BankAccount b)
    {
        this.a = a;
        this.b = b;
    }

    public double getTotalBalance()
    {
        return this.a.getBalance() + this.b.getBalance();
    }

    public String getBankName()
    {
        return this.bankName;
    }

    public String getBankInfo()
    {
        return "The Banks name: " + this.bankName + ". The Banks code: " + this.bankCode + ". The accounts: " + a.getAccountInfo() + "" + b.getAccountInfo();
    }


}
