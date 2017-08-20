/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    Stack<TreeNode> st = new Stack<TreeNode>();
    public Solution(TreeNode root) {
        TreeNode node =root;
        
        while(node!=null){
            st.push(node);
            node = node.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if(!hasNext()){
            return -1;
        }
        TreeNode node;
        node = st.pop();
        int val = node.val;
        node =node.right;
        while(node!=null){
            st.push(node);
            node = node.left;
        }
        return val;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */

