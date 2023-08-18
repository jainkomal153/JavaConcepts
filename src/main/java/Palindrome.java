public class Palindrome {

    public static void main(String[] args) {
        String s= "abb";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
    }

    private boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder(s);
        if(s.equalsIgnoreCase(String.valueOf(string.reverse()))){
            return true;
        }
        return false;
    }
}
