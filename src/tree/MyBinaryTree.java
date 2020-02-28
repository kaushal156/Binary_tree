package tree;
import node.TreeNode;

public class MyBinaryTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();

                } else {
                    temp = temp.getRight();
                }
            }
                if (node.getData() <= parent.getData()) {
                    parent.setLeft(node);
                } else {
                    parent.setRight(node);
                }
            }
        }
    //insert code in tree

    //search code in tree
    public boolean search(int data) {
        boolean response = false;
        TreeNode temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else {
                if (data <= temp.getData())
                {
                   temp= temp.getLeft();
                }
                else
                {
                    temp=temp.getRight();
                }

            }
        }
        return response;

    }
}




