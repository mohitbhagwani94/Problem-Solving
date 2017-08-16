/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int t2Sum(TreeNode A, int B) {
        Stack<TreeNode> left = new Stack<>();
        Stack<TreeNode> right = new Stack<>();
        TreeNode root = A;
        while(root!=null){
            left.push(root);
            root=root.left;
        }
        root=A;
        while(root!=null){
            right.push(root);
            root = root.right;
        }
        
        while(!right.isEmpty() && !left.isEmpty() && right.peek()!=left.peek()){
            if((left.peek().val + right.peek().val)==B){
                return 1;
            }
            if(left.peek().val + right.peek().val < B){
                TreeNode t = left.pop();
                if(t.right!=null){
                    t = t.right;
                    while(t!=null){
                        left.push(t);
                        t = t.left;
                    }
                }
            }else{
                TreeNode t = right.pop();
                if(t.left!=null){
                    t = t.left;
                    while(t!=null){
                        right.push(t);
                        t = t.right;
                    }
                }
            }
        }
        return 0;
    }
}

