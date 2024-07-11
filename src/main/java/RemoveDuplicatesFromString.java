import java.util.HashSet;

public class RemoveDuplicatesFromString {

    public HashSet<Character> solution(String s) {
        // write the solution here..
        HashSet<Character> set = new HashSet();
        char[] string = s.toCharArray();
        for(int i=0; i<string.length; i++){
            set.add(string[i]);
        }
        return set;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        RemoveDuplicatesFromString removeDuplicatesFromString = new RemoveDuplicatesFromString();
        HashSet<Character> result = removeDuplicatesFromString.solution(s);
        System.out.println(result.size());
        System.out.println(result);
    }
}




