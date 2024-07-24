import java.util.Scanner ;
public class LinkedList {
    Node first, last ;

    public LinkedList() {
        first = last = null ;
    }

    public void insertFirst (int element) {
        Node n = new Node() ;
        n.item = element ;
        n.next = first ;
        first = last = n ;
    }
    public void insertLast(int element) {
        Node n = new Node();
        n.item = element ;
        n.next = null ;
        Node t = first ;
        while (t != null && t.next != null ) {
            t = t.next ;
        } ;
        if ( t != null ) {
            t.next = n ;
        }
    }

    public void printList() {
        Node traverseNode  = first ;
        while (traverseNode != null ) {
            System.out.print("|"+traverseNode.item + "|next| -> ");
            traverseNode = traverseNode.next ;
        } ;
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList numbersList = new LinkedList();
        System.out.println("Enter positive numbers to add tothe list");
        System.out.println("Enter a negative number to stop");
        int number ;
        do{
            number = sc.nextInt();
            if ( numbersList.first == null )
                numbersList.insertFirst(number);
            else
                numbersList.insertLast(number);

        }while(number >= 0);
        numbersList.printList();
    }
}