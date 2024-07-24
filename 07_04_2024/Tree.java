public class Tree{
    public Node root ;
    int balanceFactor ;
    public Tree() {
        root = null ;
        balanceFactor = 1 ;
    }

    public Node insert(Node node ,int x) {
        if (node == null ) {
            return new Node(x);
        } ;

        if ( x < node.item ) {
            node.left = insert(node.left, x);
            
            if (Math.abs(height(node.left) - height(node.right)) > balanceFactor ) {
                //could need a right rotation or a left right rotation
                if (height(node.left.left) > height(node.left.right)){
                    //right rotation needed
                    node = rotateRight(node) ;
                } else if ( height(node.left.right) < height(node.left.left) ) {
                    //left-> right rotation needed
                   
                    node = rotateLeftRight(node);
                }
            }
            
            
            
        } else if ( x > node.item ) {
                node.right = insert(node.right, x);
                
                if ( Math.abs(height(node.right.right) - height(node.right.left)) > balanceFactor ){
                    //right rotation needed
                    node = rotateLeft(node) ;
                } else if ( height(node.right.left) - height(node.right.right) > balanceFactor   ) {
                    //right -> left rotation needed
                    node = rotateRightLeft(node) ;
                    
                }
                
           
        } ;
        return node;

    }

    public void insert(int x) {
       root = insert(root,x);
    } ;

    public int height(Node node){
        if (node == null )
            return 0 ;

        int leftHeight = height(node.left) ;
        int rightHeight = height(node.right) ;
        return Math.max(leftHeight, rightHeight) + 1 ;
    } ;
    public boolean isBalanced(Node node){
        if (node == null )
            return true ;
        int leftHeight = height(node.left) ;
        int rightHeight = height(node.right) ;
        if(Math.abs(leftHeight-rightHeight) > balanceFactor)
            return false ;
        return true;
    }
    
    public boolean isBalanced(){
        return isBalanced(root);

    } ;
    
    public Node rotateLeftRight(Node node){
        if (node == null )
            return null ;
        Node leftNode = node.left ;
        leftNode = rotateLeft(leftNode) ;
        node.left = leftNode ;
        node = rotateRight(node);
        return node ;
    } ;
        
    public Node rotateRightLeft(Node node){
        if (node == null )
            return null ;
        Node rightNode = node.right ;
        rightNode = rotateRight(rightNode) ;
        node.right = rightNode ;
        node = rotateLeft(node);
        return node ;
    } ;
    public Node rotateLeft(Node node) {
        if ( node == null )
        return node ;

        if (node.right != null ) {
            Node rightNode = node.right ;
            node.right = rightNode.left ;
            rightNode.left = node ;
            return rightNode ;
        }
        return node ;
    }

    public Node getRoot() {
        return root ;
    }


    public void setRoot(Node node) {
        root = node;
    }


    public Node minimum() {
        return minimum(root);
    }

    //Returns node with the smallest value in a balanced search tree
    public Node minimum(Node node) {
        
        if (node != null ) {
            if (node.left == null )
                return node ;
            else 
                return minimum(node.left);
        } ;
        return node ;
    } ;
    
    public void delete(int key) {
        root = delete(root, key) ;
    } ;
    
    public Node delete(Node node, int key) {
        if (node == null) return null ;

        if (key < node.item )
            node.left = delete(node.left, key); 
        else if ( key > node.item )
            node.right = delete(node.right, key);  
        else {
            if (node.right == null )    return node.left ;
            if (node.left == null ) return node.right ;
            Node t = node ;
            node = minimum(node.right);
            node.right = deleteMin(t.right);
            node.left = t.left ;
        } 
        return node ;    
    }
    public void deleteMin() {
        if (root != null )
            root = deleteMin(root) ;
            
    }
    
    public Node deleteMin(Node node) {
        if (node.left == null ) return node.right ;
        node.left = deleteMin(node.left) ;
        return node ;  
    } ;

    public Node search(int x) {
        return search(root, x);
    }
    public Node search(Node node, int x) {
        if (node == null)
            return node;
        if ( node.item == x)
            return node ;
        if (x < node.item)
            return search(node.left, x) ;
        else 
            return search(node.right, x);
    }
    
    
    public Node rotateRight(Node node) {
        if ( node == null )
        return node ;

        if (node.left != null ) {
            Node leftNode = node.left ;
            node.left= leftNode.right ;
            leftNode.right = node ;
            return leftNode ;
        }
        return node ;
    }

    public void inOrderDisplay(Node node) {
        
        if (node == null)
            return ;
        inOrderDisplay(node.left) ;
        System.out.print(node.item + " ");
        inOrderDisplay(node.right) ;
        
    }
    
    public void inOrderDisplay() {
    
        inOrderDisplay(root) ;
        
    }
    
    public void preOrderDisplay(Node node) {
        
        if (node == null)
            return ;
        
        System.out.print(node.item + " ");
        preOrderDisplay(node.left) ;
        preOrderDisplay(node.right) ;
        
    }
    
    public void preOrderDisplay() {
    
        preOrderDisplay(root) ;
        
    }
    
    public void postOrderDisplay(Node node) {
        
        if (node == null)
            return ;
        
        postOrderDisplay(node.left) ;
        postOrderDisplay(node.right) ;
        System.out.print(node.item + " ");
        
    }
    
    public void postOrderDisplay() {
    
        postOrderDisplay(root) ;
        
    }

}