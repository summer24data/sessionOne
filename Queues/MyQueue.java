public class MyQueue{

    int[] myArray;
    final int maximumQueueSize ;
    int REAR ;
    int FRONT ;

    public MyQueue() {
        this(10);
    }

    public MyQueue(int size) {
        FRONT = -1 ;
        REAR = -1 ;
        maximumQueueSize = size ;
        myArray = new int[maximumQueueSize] ;

    }

    public boolean isFull() {
        return REAR == maximumQueueSize - 1 ;
    }
    
    public boolean isEmpty() {
        return FRONT ==  -1 ;
    }

    void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (REAR == -1) {
                FRONT = REAR = 0 ;
            } else {
                REAR++;
            }
            myArray[REAR] = x ;
        }
    }

    
    void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            if (FRONT == REAR ) {
                FRONT = REAR = -1 ;
            } else {
                for(int j=0 ; j<REAR; j++) {
                    myArray[j] = myArray[j+1];

                }
                REAR-- ;
            }
            
        }
    }
    

    void display() {
        if (isEmpty())
            System.out.println("Nothing to Display: EMPTY");
        else
        for(int j=FRONT; j <= REAR ; j++){
            System.out.print(myArray[j] + " ");
        }
        System.out.println();
    }

}