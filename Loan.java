
/**
 * Write a description of class Loan here.
 *
 * @Ben Shade, Alex Harmeling, Joseph Hall
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;
    
   public Loan(int ID, double loanAmount, String country, int daysToFund, 
            int numLenders) {
                this.ID = ID;
                this.loanAmount = loanAmount;
                this.country = country;
                this.daysToFund = daysToFund;
                this.numLenders = numLenders;
   }
   
   public int getID()
   {
       return this.ID;
   }
   
   public double getLoanAmount()
   {
       return this.loanAmount;
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
 
}
