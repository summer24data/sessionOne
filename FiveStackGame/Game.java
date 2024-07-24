import java.util.Scanner ;
public class Game{

    static int STACK_COUNT;
    static Stack[] stacks ;
    public static void printStacks() {
        System.out.println("Content of Stacks: ");
        if (STACK_COUNT >= 0 && stacks != null ) {
            for(int j = 0 ; j < STACK_COUNT; j++) {
                System.out.print("S" + j + ": ");
                if (!stacks[j].isEmpty()){
                    stacks[j].printStackContent();
                }
                System.out.println();       
            }
        }
    }
    public static void main(String[] args) {
        STACK_COUNT = 5 ;
        stacks = new Stack[STACK_COUNT];
        
        for (int k=0 ; k<STACK_COUNT; k++){
            stacks[k] = new Stack(4);
        } ;

        stacks[0].push(2);
        stacks[1].push(2);
        stacks[2].push(2);
        stacks[0].push(1);
        stacks[1].push(1);
        stacks[2].push(3);
        stacks[0].push(3);
        stacks[1].push(3);
        stacks[2].push(2);
        stacks[0].push(1);
        stacks[1].push(1);
        stacks[2].push(3);
        
        printStacks();
        Scanner sc =  new Scanner(System.in);
        int cho ;
        int EXIT = 3;
        int from ;
        int to ;
        do{
            System.out.println("1. Press to move between stacks\n2. To Display\n3. To exit.");
            cho = sc.nextInt();
            switch(cho) {
                case 1:{
                    System.out.print("From: ");
                    from = sc.nextInt();
                    System.out.print("To: ");
                    to = sc.nextInt();
                    if (from >= 0 && from <  STACK_COUNT && to >= 0 && to < STACK_COUNT && from != to) {
                        stacks[to].push(stacks[from].pop());
                    }
                } ; 

                
                break;
                case 2:
                    printStacks();
                break;
                case 3:
                    System.out.println("You are exiting.");
                break ;
                default:
                    System.out.println("We cannot recognize your choice");
                break;
            }

        } while(cho != EXIT);

            

    }
}