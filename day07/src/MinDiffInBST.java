class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MinDiffInBST {
    public static int minDiffInBST(TreeNode root) {
        if(root.left.left == null) {
            return Math.abs(root.val - root.left.val);
        }
        if(root.right == null) {
            return Math.min(minDiffInBST(root.left), Math.abs(root.val - root.left.val));
        }
        int left = Math.min(minDiffInBST(root.left), Math.abs(root.val - root.left.val));
        int right = Math.min(minDiffInBST(root.right), Math.abs(root.val - root.right.val));
        return Math.min(left, right);
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(48);
        TreeNode n4 = new TreeNode(12);
        TreeNode n5 = new TreeNode(49);
        n1.left = n2;n1.right = n3;n3.left = n4;n3.right = n5;

        System.out.println(minDiffInBST(n1));
    }
}