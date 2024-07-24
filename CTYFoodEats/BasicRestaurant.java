import java.util.Scanner ;

public class BasicRestaurant{
    double priceBeforeTax ;
    double totalPrice ;
    double stateLocalTaxes;
    double totalBeforeTaxes ;
    int FINISHED;
    int menuChoice ;
    String orderDescription ;
    Scanner sc ;
    public BasicRestaurant() {
        priceBeforeTax = 0.0 ;
        
        totalPrice  = 0.0 ;
        stateLocalTaxes = 0.06 ;
        totalBeforeTaxes = 0.0 ;
        sc = new Scanner(System.in);
        FINISHED = 9 ;
        orderDescription = "";
    }
    public void printBill() {

    }
}