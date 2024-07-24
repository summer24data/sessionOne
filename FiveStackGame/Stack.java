public class Stack{

    int numberOfItems ;
    int [] stack ;
    final int maximumSize ;
    int topIndex ;
    public Stack() {
        this(10) ;
    }

    public Stack(int size){
        topIndex = -1 ;
        numberOfItems = 0 ;
        maximumSize = size ;
        stack = new int[maximumSize] ;
    }

    public boolean isFull() {
        return numberOfItems == maximumSize ;
    }

    public boolean isEmpty() {
        return (numberOfItems == 0) ;
    }

    public int pop() {
        if(!isEmpty()) {
            int top = stack[topIndex] ;
            topIndex-- ;
            numberOfItems--;
            
            return top ;
        } 
        System.out.println("Stack is Empty. Please add items to stack");
        return -1 ;
    }

    public void push(int item) {
        if (!isFull()){
            topIndex++ ;
            stack[topIndex] = item ;
            numberOfItems++;
        }
    }

    public void display() {
       
        for(int j=0; j<=topIndex; j++){
            System.out.print(" " + stack[j]);
        }
        System.out.println();
    }

    public int peek() {
        
        if(topIndex >= 0 && topIndex <= (maximumSize-1)) {
            
            return stack[topIndex] ;
        } else {
            
            System.out.println("Stack is Empty. Please add items to stack");
            return -1 ;
        }

    }
    public void printStackContent() {
        if (topIndex >= 0) {
            for(int k = 0 ; k <= topIndex ; k++) {
                System.out.print(stack[k] + " ");
            }
            
        }
       
            

    }
}