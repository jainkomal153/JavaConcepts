import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public ArrayList<Integer> subArraySum(int[] arr, int n, int s){
        ArrayList<Integer> result = new ArrayList<>(2);
        if(n<=1){
            if(arr[0] == s){
                result.add(1);
                result.add(1);
            }else result.add(-1);
        }else{
            int left=0;
            int right =1;
            int sum = arr[left];

            while(left <= right) {
                if (sum < s) {
                    sum = sum + arr[right];
                    right++;
                } else if (sum > s) {
                    sum = sum - arr[left];
                    left++;
                } else {
                    result.add(left + 1);
                    result.add(right);
                    break;
                }

            }
        }
        if(result.isEmpty()){result.add(-1);}
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int s=15;
        SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
//        System.out.println(arr.length);
        System.out.println(subArrayWithGivenSum.subArraySum(arr, arr.length, s).toString());
    }
}
