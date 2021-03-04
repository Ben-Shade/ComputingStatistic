import java.util.ArrayList;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         amount = amount + loan.getLoanAmount();
      }
      return amount;
   }
   //Calculates and returns the average amount funded from all the loans.
   public double avgLoan()
   {
      double average = 0.0;
      Loan loan;
      int counter = 0;
      for (int i = 0; i < data.size(); i++)
      {
          loan = data.get(i);
          average = average + loan.getLoanAmount();
          counter++;
      }
      return average/counter;
   }
   //Finds the largest loan amount from all of the loans.
   public double largestLoan()
   {
       double largest = 0.0;
       Loan loan;
       for (int i = 0; i < data.size(); i++)
       {
           loan = data.get(i);
           if (loan.getLoanAmount() > largest)
           {
               largest = loan.getLoanAmount();
           }
       }
       return largest;
   }
   //Calculates the average amount of days to fund all of the loans.
   public double avgDaysToFund()
   {
       Loan loan;
       double average = 0.0;
       int counter = 0;
       for (int i = 0; i< data.size(); i++)
       {
           loan = data.get(i);
           average = average + loan.getDaysToFund();
           counter++;
       }
       return average/counter;
   }
   public double largestLoanC(String Country)
   {
       Loan loan;
       double largest = 0.0;
       for (int i = 0; i < data.size(); i++)
       {
           loan = data.get(i);
           if(loan.getCountry().equals(Country))
           {
               if(loan.getLoanAmount() > largest)
               {
                   largest = loan.getLoanAmount();
               }
           }
       }
       return largest;
   }
   



}
