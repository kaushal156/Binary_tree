package main;
import tree.MyBinaryTree;
import node.TreeNode;
public class Main {
    public static void main(String[] args) {
        MyBinaryTree src=new MyBinaryTree();
        src.insert(100);
        src.insert(200);
        src.insert(300);
        src.insert(400);
        src.insert(40);
        src.insert(3);

        System.out.println(src.search(2));


    }
}
