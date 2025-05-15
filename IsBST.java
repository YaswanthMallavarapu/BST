/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void inorder(TreeNode root,ArrayList<Integer>order){
        if(root==null)return;
        inorder(root.left,order);
        order.add(root.val);
        inorder(root.right,order);
    }
    public static boolean isSorted(ArrayList<Integer>order){
        for(int i=0;i<order.size()-1;i++){
            if(order.get(i)>=order.get(i+1))return false;
        }
        return true;
    }
    public static boolean isBST(TreeNode root,int min,int max){
        if(root==null)return true;
        if(root.val<=min||root.val>=max)return false;
        return isBST(root.left,min,root.val)&&isBST(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        // if(root==null)return true;
        // ArrayList<Integer>order=new ArrayList<>();
        // inorder(root,order);
        // return isSorted(order);
        if(root==null||root.right==null&&root.left==null)return true;
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        return isBST(root,min,max);
    }
}