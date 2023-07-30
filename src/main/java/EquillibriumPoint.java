public class EquillibriumPoint {

    public int equillibriumPoint(long arr[], int n){
        int left =0;
        int right = n-1;
        long leftSum = 0;
        long rightSum = 0;

        while(left<right){
            if (leftSum < rightSum){
                leftSum = leftSum + arr[left];
                left++;
            }
            else if (leftSum > rightSum){
                rightSum = rightSum + arr[right];
                right--;
            }
            else if(leftSum == rightSum){
                leftSum = leftSum + arr[left];
                rightSum = rightSum + arr[right];
                left++;
                right--;
            }
        }
        if(left==right && leftSum == rightSum){
            return left+1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        long[] arr={1,2,3,5};
        EquillibriumPoint equillibriumPoint= new EquillibriumPoint();
        System.out.println(equillibriumPoint.equillibriumPoint(arr, arr.length));
    }
}
