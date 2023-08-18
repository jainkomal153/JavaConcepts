public class PowerOfTwo {

    public boolean isPowerOfTwo(long n){
        int num =1;
        while(num<n){
            num = recursion(num);
        }
        if(num == n){
            return true;
        }
        return false;
    }

    public int recursion(int num){
        num= num * 2;
        return num;
    }


    public boolean isPowerOfTwoUsingBinaryOperator(int num){
        int result = num !=0 ? num & num-1: 1;
        if(result ==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(0));
        System.out.println(powerOfTwo.isPowerOfTwoUsingBinaryOperator(0));
    }
}
