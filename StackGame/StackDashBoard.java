import java.util.Scanner ;

public class StackDashBoard{

    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int FINISH = 5;
        int menuChoice ;
        int item ;
        Stack myStack = new Stack();
        do{ 
            
            System.out.println("-----------Menu----------------");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit");
            menuChoice = sc.nextInt();

            switch(menuChoice) {
                case 1:{
                    System.out.println("Enter item to push into stack: ");
                    item = sc.nextInt();
                    myStack.push(item);

                } ;
                break;
                case 2: 
                    System.out.println(myStack.pop());
                break;
                case 3:
                    System.out.println(myStack.peek());
                break;
                case 4:
                    myStack.display();
                break ;
                case 5:
                    System.out.println("You are exiting the program");
                break;
                default:
                    System.out.println("We could not recognize your choice");
                break ;
            }

        }while(menuChoice != FINISH);
        sc.close();
    }
}