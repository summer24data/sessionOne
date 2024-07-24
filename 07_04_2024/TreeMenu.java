public class TreeMenu{


    public static void main(String [] args) {
        Tree tree = new Tree();

        tree.insert(9);
        tree.insert(3);
        tree.insert(5);
        System.out.print("In Order display after all insertions : ");
        tree.inOrderDisplay();
        System.out.println();
        System.out.print("Pre Order display after all insertions : ");
        tree.preOrderDisplay();

       
       

    }
}