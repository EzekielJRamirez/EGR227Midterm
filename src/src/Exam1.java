import java.util.Stack;

public class Exam1 {
    public static void main(String[] args) {
        System.out.println("yes");
//        hasMatchingParenthesis(")");
        boolean paren = hasMatchingParenthesis("))))))");
        System.out.println(paren);
    }


    public static boolean hasMatchingParenthesis(String str){
        for (int i = 0; i < str.length(); i++){
            if(!str.substring(i, i + 1).equals("(") && !str.substring(i, i + 1).equals(")")) {
                throw new IllegalArgumentException("Wrong symbol/letter used: " + str.substring(i, i + 1));
            }
            // checks if there is a letter other than '(' or ')'
        }


        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == '('){
                //1)do something here

            }else if(str.charAt(i) == ')'){
                //2)do something here

            }else{
                //3)do something here

            }
        }
        //4)do something here

        System.out.println("method works");
        return false;
    }
}
