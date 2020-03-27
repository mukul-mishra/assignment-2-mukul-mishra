/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;
public class MyBinarySearchTree {
    public TreeNode root;
    public int c=0;
    public void insert(int value) {
        TreeNode node = new TreeNode<>(value);
        if ( root == null ) {
            root = node;
        }
        else {
            insertRec(root, node);
        }
    }

    private void insertRec(TreeNode latestRoot, TreeNode node) {
        if ( latestRoot.value > node.value) {
            if ( latestRoot.left == null ) {
                latestRoot.left = node;
            }
            else {
                insertRec(latestRoot.left, node);
            }
        }
        else{
            if (latestRoot.right == null) {
                latestRoot.right = node;
            }
            else{
                insertRec(latestRoot.right, node);
            }
        }
    }
    public void printPreOrder() {
        printPreOrderRec(root);
        System.out.println("");
        System.out.print(c);
    }
    int i = 1;
    private void printPreOrderRec(TreeNode currentRoot) {
        if(currentRoot==null) {
            return;
        }
        System.out.println(i + " element::" +  currentRoot.value );
        i++;
        printPreOrderRec(currentRoot.left);
        printPreOrderRec(currentRoot.right);
    }
}
