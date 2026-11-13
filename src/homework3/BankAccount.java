package homework3;
public class BankAccount
{
    private int accountId;
    private String ownerName;
    private double balance;
    private boolean isActive;
    private static int nextId = 1000;
    private static int totalAccounts = 0;

    public BankAccount(String ownerName)
    {
        this.ownerName = ownerName;
        this.accountId = this.nextId;
        nextId++;
        totalAccounts ++;
        this.isActive = true;
        this.balance = 0;
    }

    public BankAccount(String ownerName, double initialBalance)
    {
        this.ownerName = ownerName;
        this.accountId = this.nextId;
        nextId++;
        totalAccounts ++;
        this.isActive = true;
        this.balance = (initialBalance>=0) ? initialBalance:0;
    }

    public boolean deposit(double amount)
    {
        if(this.isActive)
        {
            if(isValidAmount(amount))
            {
                this.balance += amount;
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(double amount)
    {
        if(this.isActive)
        {
            if(isValidAmount(amount)&&amount<=this.balance)
            {
                this.balance -= amount;
                return true;
            }
        }
        return false;
    }

    public boolean transferTo(BankAccount destination, double amount)
    {
        if(this.isActive)
        {
            if(this.accountId!=destination.accountId&&destination!=null)
            {
                if(isValidAmount(amount)&&amount<=this.balance)
                {
                    this.balance -= amount;
                    destination.balance += amount;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean closeAccount()
    {
        if(this.isActive&&this.balance==0)
        {
            this.isActive=false;
            return true;
        }
        return false;
    }

    public String getAccountInfo()
    {
        return "Owner name is: " + this.ownerName + ". account id is: " + this.accountId + ". balance is: " + this.balance + ". status is: " + this.isActive + ".";
    }

    public void setOwnerName(String ownerName)
    {
        if(ownerName!="")    this.ownerName = ownerName;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public int getAccountId()
    {
        return this.accountId;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public boolean getIsActive()
    {
        return this.isActive;
    }

    public static int getTotalAccounts()
    {
        return totalAccounts;
    }

    public static boolean isValidAmount(double amount)
    {
        return(amount>=0);
    }

    public static int getNextAccountId()
    {
        return nextId;
    }


}
