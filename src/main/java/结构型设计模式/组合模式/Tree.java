package 结构型设计模式.组合模式;

/**
 * @author torvalds on 2018/10/7 15:48.
 * @version 1.0
 */

/**
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
public class Tree {
    TreeNode root;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}

class TreeTest {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode treeNodeB = new TreeNode("B");
        TreeNode treeNodeC = new TreeNode("C");
        treeNodeB.addChildren(treeNodeC);
        tree.getRoot().addChildren(treeNodeB);
        System.out.println("tree = " + tree);

    }
}