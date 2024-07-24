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
            if (height(node.left) > height(node.right)) {
                //could need a right rotation or a left right rotation
                if (height(node.left.left) > height(node.left.right)){
                    //right rotation needed
                    node = rotateRight(node) ;
                } else if ( height(node.left.right) - height(node.left.left) > balanceFactor ) {
                    //left-> right rotation needed
                    node.left = rotateLeft(node.left);
                    node = rotateRight(node);
                }
            }
            
            
        } else if ( x > node.item ) {
                node.right = insert(node.right, x);
                if (height(node.right.right) > height(node.right.left)){
                    //right rotation needed
                    node = rotateLeft(node) ;
                } else if ( height(node.right.left) - height(node.right.right) > balanceFactor   ) {
                    //right -> left rotation needed
                    node.right = rotateRight(node.right) ;
                    node= rotateLeft(node) ;
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

    }
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
    
    public void delete(int item) {
        root = delete(root, item) ;

    }
    public Node delete(Node node, int item) {
        Node nodeItem = search(node, item) ;
        if (nodeItem == null )
            return node ;
        if (nodeItem.left == null && nodeItem.right == null)
            return null ;
        else if (nodeItem.left != null ) {
            nodeItem.item = nodeItem.left.item ;
            nodeItem.left = delete(nodeItem.left, nodeItem.left.item) ;
            return nodeItem ;
        } else {
            //nodeItem.right != null
            
            Node inOrderSuccessor = minimum(nodeItem.right) ;
            if (inOrderSuccessor != null ) {
                nodeItem.item = inOrderSuccessor.item ;
                nodeItem.right = delete(nodeItem.right, inOrderSuccessor.item);
            } else {
                
            }
            return nodeItem;
        };

        return node ;

    }
    
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