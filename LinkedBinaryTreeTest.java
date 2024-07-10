import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinkedBinaryTreeTest {
	@Test
	void test() {
            // Create a new Tree. Tree's name is myTree
            LinkedBinaryTree<Integer> myTree = new LinkedBinaryTree<Integer>();
            assertTrue(myTree.isEmpty());

            // Create a Node. Node's name is root. Node root has number 4
            Node<Integer> root = myTree.addRoot(4);
            assertTrue(myTree.isLeaf(root));
            assertEquals(1, myTree.size());
            assertFalse(myTree.isEmpty());
            // check if the node has both left and right child
            assertFalse(myTree.isFull(root));

            myTree.remove(root);
            assertEquals(0, myTree.size());
            root = myTree.addRoot(4);

            // Create a Node. Node's name is left. Node left has number 2.
            Node<Integer> left = myTree.addLeft(root, 2);
            assertEquals(2, myTree.size());
            assertFalse(myTree.isLeaf(root));
            assertTrue(myTree.isLeaf(left));
            assertFalse(myTree.isFull(left));

            // Create a Node. Node's name is right. Node right has number 6.
            Node<Integer> right = myTree.addRight(root, 6);
            assertEquals(3, myTree.size());
            assertEquals(root, myTree.root());
            assertTrue(myTree.isLeaf(right));
            // Imagine myTree picture. 4 is root Node, 2 is left and 6 is right Node
            assertEquals("4(2,6)", myTree.toString());
            assertFalse(myTree.isFull(right));

            myTree.addLeft(left, 1);    // added Node 1 to Node left
            myTree.addRight(left, 3);    // added Node 3 to Node left
            myTree.addLeft(right, 5);    // added Node 5 to Node right
            myTree.addRight(right, 7);    // added Node 7 to Node right
            assertTrue(myTree.isFull(root));

            // originally had 3 and added 4 more.
            assertEquals(7, myTree.size());
            // can you draw myTree in your head?
            assertEquals("4(2(1,3),6(5,7))", myTree.toString());

            myTree.remove(root);    // removing 4
            assertEquals(6, myTree.size());
            // can you draw myTree in your head?
            assertEquals("1(2(null,3),6(5,7))", myTree.toString());

            // In-class exercise3
            // create the tree in the slide
            // hint: LinkedBinaryTree<Integer> myTree = new LinkedBinaryTree<Integer>();
            // students will need to implement from here
            LinkedBinaryTree<String> newTree = new LinkedBinaryTree<String>();

            Node<String> rooter = newTree.addRoot("+");


            // Create a Node. Node's name is left. Node left has number X.
            Node<String> lefted = newTree.addLeft(rooter,"x" );
            Node<String> righed = newTree.addRight(rooter, "/");
            // Add 1 and 3 too X node
            newTree.addLeft(lefted, "1");
            newTree.addRight(lefted, "3");
            // Add 6 and 2 too / node
            newTree.addLeft(righed,"6");
            newTree.addRight(righed,"2");

            assertEquals("+(x(1,3),/(6,2))",newTree.toString());
            System.out.println(newTree.inFix());
            assertEquals("((1x3)+(6/2))",newTree.inFix());
            assertTrue(newTree.contains("2"));
            assertFalse(newTree.contains("4"));
	}
}
