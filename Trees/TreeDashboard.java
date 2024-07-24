public class TreeDashboard{


    public static void main(String [] args) {
        Tree tree = new Tree();

        tree.insert(3);
        tree.insert(6);
        tree.insert(9);

        tree.insert(12);
        tree.insert(8);
        tree.insert(5);

        System.out.print("In Order display after all insertions : ");
        tree.inOrderDisplay();
        System.out.println();
        System.out.print("Pre Order display after all insertions : ");
        tree
.delete(5);
        System.out.print("Post Order display after deletion 5 : ");
        tree.preOrderDisplay();
        System.out.println();
        System.out.print("Post Order display after deletion 5 : ");
        tree.postOrderDisplay();
        System.out.println();

    }
}