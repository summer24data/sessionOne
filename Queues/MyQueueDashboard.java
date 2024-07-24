import java.util.Scanner;

public class MyQueueDashboard{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int FINISHED = 4;
        int item ;
        int menuChoice ;
        MyQueue myQueue = new MyQueue() ;
        do{
            System.out.print("1. ENQUEUE\n2. DEQUEUE\n3. DISPLAY\n4. EXIT\nMake a menu choice: ");
            menuChoice = sc.nextInt();

            switch(menuChoice) {
                case 1:{
                    System.out.print("Enter item to ENQUEUE : ");
                    item = sc.nextInt() ;
                    myQueue.enqueue(item);
                } ;
                break ;
                case 2:
                    myQueue.dequeue();
                break ;
                case 3:{
                    myQueue.display();
                };
                break;
                case 4 :
                    System.out.println("You chose to exit");
                break;
                default:
                    System.out.println("We cannot recognize your choice");
                break;
            }

        } while(menuChoice != FINISHED ) ;
        sc.close();
    }
}