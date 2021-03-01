
/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    private int ID;
    private double LoanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;
    public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
    {
        this.ID = ID;
        this.LoanAmount = LoanAmount;
        this.country = country;
        this.daysToFund = daysToFund;
        this.numLenders = numLenders;
    }
    public int getNumLenders(){
        return this.numLenders;
    }
    public int getDaysToFund(){
        return this.daysToFund;
    }
    public int getID()
    {
        return this.ID;
    }
    public double getLoanAmount()
    {
        return this.LoanAmount;
    }
    public String getCountry()
    {
        return this.country;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }  
    public void setDaysToFund(int daysToFund)
    {
        this.daysToFund = daysToFund;
    }  
    public void setNumLenders(int numLenders)
    {
        this.numLenders = numLenders;
    }   
    public void setLoanAmount(int LoanAmount)
    {
        this.LoanAmount = LoanAmount;
    }
    public void setcountry(String country)
    {
        this.country = country;
    }
}