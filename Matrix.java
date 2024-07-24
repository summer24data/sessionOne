import java.util.Scanner;
public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 3 ;
        int[][] matrix = new int[MAX][];
        int i, j ;
        for (i=0 ; i < MAX ; i++) {
            matrix[i] = new int[MAX];
        } ;
        

    
        
        for(i=0 ; i< MAX; i++ ){ 
            
            for(j=0 ; j < MAX ; j++){
                System.out.print("Enter a value at Matrix["+i+"]["+j+"] : ");
                matrix[i][j] = sc.nextInt();
            } 
           
        } 
        boolean uptri = true;
        for(i=0 ; i<MAX; i++){
            System.out.print("Matrix["+i+"] : ");
            for(j=0; j<MAX;j++){
                System.out.print(matrix[i][j] + " ");
                
                if (( i >= j && matrix[i][j] != 0) || ( i == j && matrix[i][j] == 0) || (i <= j && matrix[i][j] == 0))
                    uptri = false ;
            }; 
            System.out.println();         
        }
        System.out.println("Upper Triangle = " + uptri);  
    }  

}