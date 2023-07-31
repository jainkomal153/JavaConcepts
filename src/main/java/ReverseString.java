public class ReverseString {

    public String reverse(String str){

//        method 1:  Using StringBuilder
//        StringBuilder reverseString = new StringBuilder(str);
//        reverseString.reverse();
//        return reverseString.toString();

//        method 2: Building a function
        char[] string = str.toCharArray();
        char temp;

       int left = 0;
       int right = string.length-1;
       while(left<right){
           temp = string[left];
           string[left] = string[right];
           string[right] = temp;
           left++;
           right--;
       }
       return String.valueOf(string);
    }
    public static void main(String[] args) {
        String str = "Hello";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(str));
    }
}
