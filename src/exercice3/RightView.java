package exercice3;

public class RightView {
	
	// Fonction pour imprimer la vue de droite de l'arbre binaire
    public static void printRightView(Node root) {
        // Appel d'une fonction auxiliaire pour effectuer une traversée post-ordre de l'arbre
        traverse(root, 1, new int[]{0});
    }

    // Fonction auxiliaire pour effectuer une traversée post-ordre de l'arbre binaire
    public static void traverse(Node node, int level, int[] maxLevel) {
        if (node == null) {
            return;
        }
        if (level > maxLevel[0]) {
            System.out.print(node.val + " ");
            maxLevel[0] = level;
        }
        traverse(node.right, level + 1, maxLevel);
        traverse(node.left, level + 1, maxLevel);
    }

    // Fonction main pour tester l'algorithme
    public static void main(String[] args) {
        // Exemple 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        root1.right.right.right = new Node(8);

        System.out.print("Right view of tree 1 is: ");
        printRightView(root1); // Output: 1 3 7 8

        // Exemple 2
        Node root2 = new Node(1);
        root2.left = new Node(8);
        root2.left.left = new Node(7);

        System.out.print("\nRight view of tree 2 is: ");
        printRightView(root2); // Output: 1 8 7
    }
}
