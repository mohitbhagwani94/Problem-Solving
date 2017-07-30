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
    HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
    Queue<Integer> offset = new LinkedList<>();
    Queue<TreeNode> pt = new LinkedList<>();
    
    int minValue=0;
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>(); 
        
        if (A == null) return res;
        
        pt.add(A);
        offset.add(0);
        
        
        while(!pt.isEmpty()){
            TreeNode curr = pt.poll();
            int offs = offset.poll();
            
            if(offs<minValue){minValue = offs;}
            
            if(hm.containsKey(offs)){
                ArrayList<Integer> ar = hm.get(offs);
                ar.add(curr.val);
                hm.put(offs,ar);
            }else{
                ArrayList<Integer> ar = new ArrayList<Integer>();
                ar.add(curr.val);
                hm.put(offs,ar);
                
            }
            
            if(curr.left != null){
                pt.add(curr.left);
                offset.add(offs-1);
            }
            
            if(curr.right != null){
                pt.add(curr.right);
                offset.add(offs+1);
            }
        }
       
        for(int i=minValue;hm.containsKey(i);i++){
            res.add(hm.get(i));
        }
        return res;
    }
}
