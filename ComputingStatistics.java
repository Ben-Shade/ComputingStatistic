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
   public double smallestLoan(){
       double smallest = 0.0;
       Loan loan;
       for (int i = 0; i < data.size(); i++){
           loan = data.get(i);
           if (loan.getLoanAmount() < smallest){
                smallest = loan.getLoanAmount();
           }
       }
       return smallest;
   }
    public String largestLoanCountry(){
        String country = "";
        double largest = 0.0;
        Loan loan;
        for (int i = 0; i > data.size(); i++){
           loan = data.get(i);
           if (loan.getLoanAmount() > largest)
           {
               largest = loan.getLoanAmount();
               country = loan.getCountry();
           }
           
        }
        return country;
    }
}
