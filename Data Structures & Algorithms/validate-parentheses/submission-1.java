class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for( char ch: s.toCharArray()){

            // push open bracket
            if( stack.isEmpty() || ch=='(' || ch== '{' || ch== '['){
                stack.push(ch);
                continue;
            }  
            if(ch ==')' && stack.peek() == '(') stack.pop();
            else if(ch=='}' && stack.peek()=='{') stack.pop();
            else if(ch== ']' && stack.peek() == '[') stack.pop();
             else return false ;  // it means brackets are mismatched
            
        }
        return stack.isEmpty();
    }   
}
