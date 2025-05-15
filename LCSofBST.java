/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static boolean findPath(TreeNode root, TreeNode node, ArrayList<TreeNode> path) {
        if (root == null)
            return false;
        path.add(root);
        if (root.val == node.val)
            return true;
        if (findPath(root.left, node, path) || findPath(root.right, node, path))
            return true;
        path.remove(path.size() - 1);
        return false;
    }

    public static TreeNode LCS(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        int curr = root.val;
        if (curr > p.val && curr > q.val)
            return LCS(root.left, p, q);
        else if (curr < p.val && curr < q.val)
            return LCS(root.right, p, q);
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
        // ArrayList<TreeNode>path1=new ArrayList<>();
        // ArrayList<TreeNode>path2=new ArrayList<>();
        // findPath(root,p,path1);
        // findPath(root,q,path2);
        // int i=0,j=0;
        // while(i<path1.size()&&j<path2.size()){
        // if(path1.get(i)!=path2.get(j))return path1.get(i-1);
        // i++;
        // j++;
        // }
        // return path1.get(i-1);
        return LCS(root, p, q);
    }
}