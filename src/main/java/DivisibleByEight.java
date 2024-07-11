//Given a string representation of a decimal number s, check whether it is divisible by 8.

public class DivisibleByEight {

    private int checkIfDivisbleByEight(String s){
        int number;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            number = Integer.parseInt(s.substring(s.length()-3,s.length()));
        }
        return number%8==0 ? 1:-1;
    }

    public static void main(String[] args) {
        String s = "16a";
        DivisibleByEight divisibleByEight = new DivisibleByEight();
        System.out.println(divisibleByEight.checkIfDivisbleByEight(s));
    }

}
