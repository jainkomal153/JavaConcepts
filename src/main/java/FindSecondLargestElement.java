import java.util.*;

public class FindSecondLargestElement {
    public int secondLargestElement(int arr[], int n){
        if(n<=1){
            return -1;
        }
       Arrays.sort(arr);
        for(int i=n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {10,10,6,7};
        FindSecondLargestElement findSecondLargestElement = new FindSecondLargestElement();
        System.out.println(findSecondLargestElement.secondLargestElement(arr, arr.length));
    }

}
