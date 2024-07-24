
public class Interleave{

    public static void printArray(int[] a) {
        if (a != null && a.length > 0) {
            for (int i=0; i < a.length ; i++)
                System.out.print(a[i] + " ");
            
            System.out.println();
        }
    }
    public static int[] interleave(int [] l1, int[] l2){
    
        if (l1.length > 0 && l2.length > 0) {
            int[] l3 = new int[l1.length + l2.length] ;
            int i,j,k ;
            i=0 ; j = 0 ;
            k=0;
            boolean left = true ;
            boolean right = false ;
            while (i < l1.length && j < l2.length) {
                if (left ) {
                    l3[k] = l1[i] ;
                    left = false ;
                    right = true ;
                    i++ ;
                    k++;
                } else if (right) {
                    l3[k] = l2[j] ;
                    right = false;
                    left = true ;
                    j++;
                    k++;
                }
            }
            if (l1.length > l2.length ) {
                while(i < l1.length ) {
                    l3[k] = l1[i];
                    k++;
                    i++;
                }
            } else {
                while(j < l2.length ) {
                    l3[k] = l2[j];
                    k++;
                    j++;
                }
            }
            return l3;
        }
        return null ;
    }
    public static void main(String[] args){

        int [] a1 = {1,3,5,7,9};
        System.out.print("A1: ");
        printArray(a1);
        int [] a2 = {0, 2, 4, 6, 8, 10, 12};
        System.out.print("A2: ");
        printArray(a2);
        int [] a3 = interleave(a1, a2);
        System.out.print("A3: ");
        printArray(a3);

    }
}