import java.util.Scanner;
public class SwitchCase{
    public static void main(String[] args) {
        int cho ;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            cho = sc.nextInt();
            switch(cho){
                case 1:
                    System.out.println("You entered 1");
                case 2:
                    System.out.println("You entered 2");
                break;
                case 3:
                    System.out.println("You entered 3");            
                case 4:
                    System.out.println("You entered 4");          
                case 5:
                    System.out.println("You entered 5");
                default:
                    System.out.println("I can't recognize your choice");
               
            }


        } while(cho != 9) ;


    }
}