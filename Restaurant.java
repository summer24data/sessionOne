
import java.util.Random ;
import java.util.Scanner;
public class Restaurant {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sandwichOnlyPrice = 5.99;
        double sandwichComboPrice = 6.99 ;
        double drinkPriceOnly = 1.99 ;
        double cookieOnlyPrice = 2.49 ;
        double stateLocalTaxes = 0.06 ; // or 0.06
        double priceBeforeTax = 0.0 ;
        double totalPrice ;
        
        //Restaurant Menu Choices
        int menuChoice = 0;
        int FINISHED = 5;
        //Order title
        String orderDescription = "";

        do {

            System.out.println("#########################################");
            System.out.println("#  Welcome to CTY Student Restaurant    #");
            System.out.println("# 1. Press 1 to order just a sandwich   #");
            System.out.println("# 2. Press 2 to order a sandwich combo  #");
            System.out.println("# 3. Press 3 to order just a drink      #");
            System.out.println("# 4. Press 4 to order just a cookie     #");
            System.out.println("#########################################");
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1 :
                    System.out.println("You just want a sandwich.");
                    orderDescription = "1 x Sandwich" ;
                    priceBeforeTax = priceBeforeTax + sandwichOnlyPrice ;
                    menuChoice = FINISHED ;
                break;
                case 2 :
                    System.out.println("Awesome! You want a sandwich combo.");
                    System.out.println("It comes with a drink and a cookie.");
                    orderDescription =  "\n1 x Sandwich" ;
                    orderDescription += "\n1 x Chocolate Chip Cookie " ;
                    orderDescription += "\n1 x Medium Drink" ;
                    priceBeforeTax = priceBeforeTax + sandwichComboPrice ;
                    menuChoice = FINISHED ;
                break;
                case 3 :
                    System.out.println("You just want a drink.");
                    orderDescription = "1 x Medium Drink" ;
                    priceBeforeTax = priceBeforeTax + drinkPriceOnly ;
                    menuChoice = FINISHED ;
                break;
                case 4 :
                    System.out.println("You just want a cookie.");
                    orderDescription = "1 x Chocolate Chip Cookie" ;
                    priceBeforeTax = priceBeforeTax + cookieOnlyPrice ;
                    menuChoice = FINISHED ;
                break;
                default:
                    System.out.println("We cannot recognize that choice. Please try again.");
                break ;
                    
            }

        } while (menuChoice != FINISHED);
        //Printing the bill
        //generate a random number for the order number
        Random rand = new Random();

        int orderNumber = rand.nextInt(9999,99999);
        System.out.print("Order number : ");
        System.out.println(orderNumber);
        System.out.println(orderDescription);
        totalPrice = priceBeforeTax + priceBeforeTax * stateLocalTaxes ;
        System.out.println("#############################################");
        System.out.print("Total before taxes: ");
        System.out.print("$");
        System.out.println(priceBeforeTax);
        System.out.print("State Taxes : ");
        System.out.print("$");
        System.out.println(stateLocalTaxes);
        System.out.print("Total Due: ");
        System.out.print("$");
        System.out.println(totalPrice);
        System.out.println("Thank you! We value your business!");
        System.out.println("#############################################");


    }
}