package 结构型设计模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author torvalds on 2018/10/7 15:44.
 * @version 1.0
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public void addChildren(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void removeChildren(TreeNode treeNode) {
        children.remove(treeNode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
