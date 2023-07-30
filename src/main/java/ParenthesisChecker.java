import java.util.Stack;

public class ParenthesisChecker {

    public boolean isBalanced(String x){
        char[] parenthesis = x.toCharArray();
        Stack<Character> checkParens =new Stack<>();
        for(int i=0; i<parenthesis.length; i++){
            if(parenthesis[i] == '(' || parenthesis[i] == '{' || parenthesis[i] == '['){
                checkParens.push(parenthesis[i]);
            }
            else if(parenthesis[i] == ')' || parenthesis[i] == '}' || parenthesis[i] == ']'){
                if(checkParens.isEmpty() || parenthesis[i] != closingParenthesis(checkParens.lastElement())){
                    return false;
                }
                else if(!checkParens.isEmpty() && parenthesis[i] == closingParenthesis(checkParens.lastElement())){
                    checkParens.pop();
                }
            }
        }
        if (checkParens.isEmpty()){
            return true;
        }
        return false;
    }

    private char closingParenthesis(char openingBracket){
        if (openingBracket == '('){
            return ')';
        }
        if (openingBracket == '{'){
            return '}';
        }
        if (openingBracket == '['){
            return ']';
        }
        return '\u0000';
    }
    public static void main(String[] args) {
        String x= "([])";
        ParenthesisChecker parenthesisChecker = new ParenthesisChecker();
        System.out.println(parenthesisChecker.isBalanced(x));
    }
}
