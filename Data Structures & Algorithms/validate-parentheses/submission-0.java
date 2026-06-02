class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening bracket — push
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // closing bracket — check top
            else {
                // stack empty means no matching opener
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }

        // valid only if all brackets were matched
        return stack.isEmpty();
    }
}