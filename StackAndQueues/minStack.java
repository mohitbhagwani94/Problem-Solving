class Solution {
    Stack<Integer> st  = new Stack<Integer>();
    int minEle;
    public void push(int x) {
        if(st.size()==0){
            minEle=x;
            st.push(x);
        }else{
            if(x<minEle){
                st.push(2*x-minEle);
                minEle = x;
            }
            else{
                st.push(x);
            }
        
        }
    }

    public void pop() {
        if(st.size()!=0){
            int out = st.pop();
            minEle = out<minEle?2*minEle-out:minEle;
        }
    }

    public int top() {
        if(st.size()==0){
            return -1;
        }else{
             int top = st.peek();
            if(top<minEle){
                return minEle;
            }
             return top;
        }
    }

    public int getMin() {
        
        if(st.size()==0){
            return -1;
        }else{
            return minEle;
        }
    }
}
