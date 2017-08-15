import java.util.*;
public class Solution {
    public int kthsmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode n =  root;
        while(n!=null){
            st.add(n);
            n=n.left;
        }
        while(st.size()!=0){
            n = st.pop();
            k--;
            if(k==0){
                return n.val;
            }
            if(n.right!=null){
                n=n.right;
                while(n!=null){
                    st.push(n);
                    n=n.left;
                }
            }
        }
        return -1;
    }
}

