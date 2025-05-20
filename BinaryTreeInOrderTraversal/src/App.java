import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Solution {
       public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            dfs(res, root);
            return res;
        }

        public static void dfs(List<Integer> res, TreeNode root){
            if (root != null){
                if(root.left != null){
                    dfs(res, root.left);
                }
                res.add(root.val);
                if(root.right != null){
                    dfs(res, root.right);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        TreeNode p = new TreeNode(1);
        p.right = p1;
        p1.left = p2;
        
        List<Integer> x = Solution.inorderTraversal(p);

        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }
}
