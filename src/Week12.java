import java.util.*;

public class Week12 {
    public static void main(String[] args){

        int[] arr = new int []{1, 2, 3, 4, 6, 5, 8, 9, 10};
        System.out.println(missingNumber(arr, 10));

        String word = "HELl() People (";
        String word2 = "(Hello)";

        System.out.println(equals(word));
        System.out.println(equals(word2));

    }

//    Imagine a list of numbers from 1 to max_num, inclusive - except that one of these numbers will be missing from the list.
//
//    Write a function that takes this list of numbers, as well as the max_num, and it should return the missing number.
//
//    For example, given a list of numbers, in random order, of 1…10, 8 was removed. If this list and the maxNum of 10 was passed into the function, it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8
//
//    If there is no missing number, the function should return 0.

    public static int missingNumber(int[] intList, int max){

        Arrays.sort(intList);
        int missing = 0;
        for (int i = 1; i < max; i++){
            int start = i-1;
            System.out.println("Start : " + start);
            System.out.println("I value = " + i);
            System.out.println("array at start " + intList[start]);
            if(i != intList[start]) {
                missing = i;
                break;
            }
            else
                return missing;
        }
        return missing;
    }

//    Write a function that takes in a string and returns true or false depending on whether that string has balanced parentheses. A string has balanced parantheses if every opening paranthesis “(“ has a matching closing paranthesis “)” that closes the corresponding opening paranthesis.
//
//    For the purposes of this problem, you only need to worry about parentheses “(“and “)”, not other opening-and-closing marks, like curly brackets, square brackets, or angle brackets.

    public static boolean equals(String word){
        int open = 0;
        int closed = 0;
        boolean pop;

        for(int i=0; i < word.length(); i++){
            if (word.charAt(i) == ')')
                closed ++;
            else if(word.charAt(i) == '(')
                open ++;
        }

        if(closed == open){
            pop = true;
        } else{
            pop = false;
        }
        return pop;
    }
}

/*
public static boolean balancedParentheses(String s) {
    int numUnclosedOpenParens = 0;
    for (int i = 0; i < s.length(); i += 1) {
        if (s.charAt(i) == '(') {
            numUnclosedOpenParens += 1;
        }
        else if (s.charAt(i) == ')') {
            numUnclosedOpenParens -= 1;
        }

        if (numUnclosedOpenParens < 0) {
            return false;
        }
    }

    return numUnclosedOpenParens == 0;
}

public static boolean balancedBrackets(String s) {

    Stack<Character> stack = new Stack<Character>();
    HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
    bracketPairs.put(')', '(');
    bracketPairs.put(']', '[');
    bracketPairs.put('}', '{');
    bracketPairs.put('>', '<');

    for (int i = 0; i < s.length(); i += 1) {

        // If character is opening bracket
        if (bracketPairs.containsValue(s.charAt(i))) {
            stack.push(s.charAt(i));
        }
        // Else, if character is closing bracket
        else if (bracketPairs.containsKey(s.charAt(i))) {
            // Closing bracket without matching opening bracket
            if (stack.isEmpty()) {
            return false;
            }
            // Check that most recent bracket on stack matches
            Character mostRecentBracket = stack.pop();
            if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
            return false;
            }
        }
    }

    return stack.isEmpty();
}
 */