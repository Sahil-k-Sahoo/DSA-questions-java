import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(' ||c=='{'||c=='[' ){
                st.push(c);
            }
            else{
                if (st.isEmpty())
                return false;
                char peak=st.pop();
                if ((c==')' && peak!='(')||(c=='}' && peak!='{')||(c==']' && peak!='[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}