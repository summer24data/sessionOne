public class Node {
    public int item ;
    Node left ;
    Node right ;
    public Node() {
        this(0);

    }
    
    public Node(int x) {
        left = null ;
        right = null ;
        item = x ;
    }
}