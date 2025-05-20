import java.util.LinkedList;
import java.util.Queue;

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
 
  class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode q1Current = q1.poll();
            TreeNode q2Current = q2.poll();

            if (q1Current == null && q2Current == null) continue;
            if (q1Current == null || q2Current == null) return false;
            if (q1Current.val != q2Current.val) return false;

            q1.add(q1Current.left);
            q1.add(q1Current.right);
            q2.add(q2Current.left);
            q2.add(q2Current.right);
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}

    public static void main(String[] args) throws Exception {
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        TreeNode p = new TreeNode(1, p1, p2);
        
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        TreeNode q = new TreeNode(1, q1, q2);

        boolean x = Solution.isSameTree(p, q);

        System.out.println(x);


    }
}
