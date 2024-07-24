public class McDonalds extends BasicRestaurant {

    double bigMacOnlyPrice ;
    double bigMacComboPrice ;
    double drinkOnlyPrice ;
    double frenchFriesOnlyPrice ;
    public McDonalds() {
        super();
        
        bigMacOnlyPrice = 7.99;
        bigMacComboPrice = 10.99 ;
        drinkOnlyPrice = 1.99 ;
        frenchFriesOnlyPrice = 3.49 ;
    }

    
    public void showMenu() {
        
        System.out.println("#########################################");
        System.out.println("#  Welcome to MCdonald's Restaurant     #");
        System.out.println("# 1. Press 1 to order just a Big Mac    #");
        System.out.println("# 2. Press 2 to order a Big Mac Combo   #");
        System.out.println("# 3. Press 3 to order just a drink      #");
        System.out.println("# 4. Press 4 to order just a french fry #");
        System.out.println("#########################################");
        
    }

    public void processCustomerOrder() {
        do {
            showMenu();
            menuChoice = sc.nextInt() ;
            switch (menuChoice) {
                case 1:
                    System.out.println("You just want a Big Mac.");
                    orderDescription = "1 x Big Mac" ;
                    priceBeforeTax = priceBeforeTax + bigMacOnlyPrice ;
                    menuChoice = FINISHED ;
                break;
                case 2 :
                    System.out.println("Awesome! You want a Big Mac Combo.");
                    System.out.println("It comes with a drink and a French Fry");
                    orderDescription =  "\n1 x Big Mac" ;
                    orderDescription += "\n1 x Medium French Fries" ;
                    orderDescription += "\n1 x Medium Drink" ;
                    priceBeforeTax = priceBeforeTax + bigMacComboPrice ;
                    menuChoice = FINISHED ;
                case 3 :
                    System.out.println("You just want a drink.");
                    orderDescription = "1 x Medium Drink" ;
                    priceBeforeTax = priceBeforeTax + drinkOnlyPrice ;
                    menuChoice = FINISHED ;
                break;
                default:
                    throw new AssertionError();
            }
        }while (menuChoice != FINISHED) ;



    }
    public void printCustomerOrder() {

    }

}

