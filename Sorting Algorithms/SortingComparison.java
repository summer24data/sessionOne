import java.util.Scanner;
import java.util.Random;
public class SortingComparison{

    public static final int MIN = 99;
    public static final int MAX = 999;
    public static Random rand = new Random();
    public static int[] generateArray(int size) {

        if (size < 0 )
            size *= -1;
        int[] a = new int[size] ;
        
        for (int k = 0 ; k < size ; k++)
            a[k] = rand.nextInt(MIN,MAX);
        return a ;
    }
    
    public static void selection_sort(int [] array){
        for (int i=0 ; i < array.length; i++) {
            int smallestIndex = i ;
            for (int j = i+1 ; j < array.length ; j++) {
                if (array[j] < array[smallestIndex])
                    smallestIndex = j ;
            } ;
            swap(array, i, smallestIndex) ;
        }
    }
    
    public static void insertion_sort(int [] array){
        for (int i=1 ; i < array.length; i++) {
            int key = array[i];
            int j = i-1;
            while( j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j-1 ;
            }
            array[j+1] = key ;

        }

    }

    
    public static int partition(int[] A, int p, int r){
        int x,i,j;
        x = A[r] ;
        i = p-1 ;
        for (j=p ; j < r ; j++) {
            if (A[j] <= x) {
                i += 1 ;
                swap(A, i, j) ;
            }
        }
        swap(A, i+1, r);
        return i + 1 ;

    }
    public static void quick_sort(int[] A, int p, int r){
        int q ;
        if (p < r ) {
            q = partition(A, p, r) ;
            quick_sort(A, p, q-1);
            quick_sort(A, q+1, r);
        }   

    }


    
    public static int[] cloneArray(int[] array,int arraySize) {
        int[] newArray = new int[arraySize];
        
        for(int j=0; j < arraySize ; j++)
            newArray[j] = array[j];
        return newArray;
    }
    public static void swap(int[] array, int i, int j){
        int temp = array[i] ;
        array[i] = array[j] ;
        array[j] = temp ;
    }

    public static void display(int[] array) {
        if (array.length >= MAX){
            System.out.println(); 
            return ;
        }
           
        System.out.print("[");
        for(int k = 0 ; k < array.length ; k++)
            if( k < array.length - 1)
                System.out.print(array[k] + ", ");
            else
                System.out.println(array[k] + "]");
    } ;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        if (args.length == 0) {
            System.out.println("Usage : java SortingComparison <sizeOfArray> ");
            System.exit(0);
        } ;
        
        String arraySize = args[0];

        int size = 0, oldSize  ;
        try{
            size = Integer.parseInt(arraySize);
        } catch(NumberFormatException ne){
            
            System.out.println("Usage : java SortingComparison <sizeOfArray> ");
            System.out.println("<sizeOfArray> should be a valid number");
            System.exit(0);
        } ;
        if ( size == 0) {
            System.out.println("Usage : java SortingComparison <sizeOfArray> ");
            System.out.println("<sizeOfArray> should be a valid number greater than 0");
            System.exit(0);
        }
        final int EXIT_DO = 9;
        int sortingChoice;
        int[] a1 = generateArray(size) ;
        int[] b1;
        int[] c1;
        
        int start ;
        int stop ;
        int difference;
        do{
            System.out.print("Current array : ");
            display(a1) ;
            System.out.println("1. Press 1 for Selection Sort");
            System.out.println("2. Press 2 for Insertion Sort");
            System.out.println("3. Press 3 for Quick sort");
            System.out.println("4. Press 4 to update the size of the array");
            System.out.println("5. Press 5 to generate an array of size " + size);
            System.out.println("6. Press 6 to run all algorithms with same array");
            System.out.println(EXIT_DO+ ". Press " + EXIT_DO + " to exit");
            sortingChoice = keyboard.nextInt();

            switch(sortingChoice){
                case 1:{
                    start = (int)System.nanoTime();
                    selection_sort(a1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Selection sort took : " + difference + " nano seconds");
                    
                }; 
                break;
                case 2:{
                    
                    start = (int) System.nanoTime();
                    insertion_sort(a1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Insertion sort took : " + difference + " nano seconds");
                    
                   
                }; 
                break;
                case 3:{
                    start = (int) System.nanoTime();
                    quick_sort(a1, 0, a1.length-1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Quick sort took : " + difference + " nano seconds");
                    
                   
                    
                }; 
                break;
                case 4:{
                    oldSize = size ;
                    System.out.print("\nEnter a new size for your array : ");
                    
                    size = keyboard.nextInt();
                    if (size <= 0 ) {
                        System.out.println("The size entered was 0 or negative.");
                        System.out.println("Size was not updated");
                        size = oldSize ;
                        break ;
                    }
                    a1 = generateArray(size) ;
                    
                }; 
                break;
                case 5:{
                    a1 = generateArray(size);
                    
                }; 
                break;
                case 6:{
                    b1 = cloneArray(a1, size);
                    c1 = cloneArray(a1, size);
                    start = (int) System.nanoTime();
                    selection_sort(a1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Selection sort took : " + difference + " nano seconds");
                    
                    start = (int) System.nanoTime();
                    insertion_sort(b1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Insertion sort took : " + difference + " nano seconds");
                    
                   
                    start = (int) System.nanoTime();
                    quick_sort(c1, 0, c1.length-1);
                    stop = (int) System.nanoTime();
                    difference = stop - start ;
                    System.out.println("Quick sort took : " + difference + " nano seconds");
                    
                   
                }; 
                break;
                case EXIT_DO:
                    System.out.println("You are exiting...");
                break ;
                default:
                    System.out.println("We do not recognize that choice");
                break;
            }
            
           
        } while(sortingChoice != EXIT_DO);
        

    }
}