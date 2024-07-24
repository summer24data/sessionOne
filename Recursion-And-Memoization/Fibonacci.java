import java.util.Scanner;
public class Fibonacci{

    public static int [] fiboMemoization ;
    public static int k = 0 ;
    public static final int N = 1000;
    public static int fibonnacciRecursive(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fibonnacciRecursive(n-1) + fibonnacciRecursive(n-2) ;
    }

    public static int fibonnacciMemoization(int n) {
        if (n > N)
            return -1 ;
        if (k == 0) {
            fiboMemoization = new int[N] ;
            fiboMemoization[0]= 0;
            fiboMemoization[1] = 1 ;
            k = 1;
        }
        if (n < k)
            return fiboMemoization[n];
        else {
            int j = k ;
            for (j=k; j <n; j++) {
                fiboMemoization[j+1] = fiboMemoization[j] + fiboMemoization[j-1] ;
            } ;
            k = n ;
            return fiboMemoization[n];
        }
            
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n ;
        long start ;
        long stop ;
        long difference ;
        int resultRecursive ;
        int resultMemoization ;
        do {
            System.out.print("Enter a number to compute its fibonnacci: ");
            n = sc.nextInt();
            
            if ( n < 0 )
                break ; 
           
            start = System.nanoTime(); 
            resultMemoization = fibonnacciMemoization(n) ;
            stop = System.nanoTime(); 
            System.out.println("\n----------------------------------------------------------------------");
            System.out.println("fibonnacciMemoization["+n+"]: "+resultMemoization + " took " + (stop - start) + " nano seconds ");
            System.out.println("\n----------------------------------------------------------------------");
            /* 
            start = System.nanoTime(); 
            resultRecursive = fibonnacciRecursive(n) ;
            stop = System.nanoTime(); 
            System.out.println("fibonacciRecursive["+n+"]: "+resultRecursive + " took " + (stop - start) + " nano seconds ");
            System.out.println("\n----------------------------------------------------------------------");
            */
        } while ( n >= 0 ) ;
        
    }
}