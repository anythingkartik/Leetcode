class Solution {
    public boolean isValid(String s) {
      Stack<Character> brackets=new Stack<>();

      for(int i=0;i<s.length();i++) {
        char ch=s.charAt(i);

        if(ch=='(' || ch=='{' ||ch=='[') {
            brackets.push(ch);
        }

        else if(ch==')' || ch=='}' || ch==']') {
            if(brackets.isEmpty()) {
                return false;
            }
            char top=brackets.pop();

            if(top=='(' && ch!=')' || top=='{' && ch!='}' || top=='[' && ch!=']') {
                return false;
            }
        }
      }
      return brackets.isEmpty();
    }
}