import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TripletsWithZeroSum {

    public boolean findTriplets(int[] arr, int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public boolean findTripletsWithZeroSum(int[] arr, int n){

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int head = i+1;
            int tail = n-1;
            while(head<tail){
                int temp = -(arr[head] + arr[tail]);
                if(arr[i] < temp){
                    head++;
                } else if (arr[i] > temp) {
                    tail--;
                }else{
                    System.out.println(arr[i]);
                    System.out.println(arr[head]);
                    System.out.println(arr[tail]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,-16,43,4,7,-36,18};
        TripletsWithZeroSum tripletsWithZeroSum = new TripletsWithZeroSum();
        System.out.println(tripletsWithZeroSum.findTripletsWithZeroSum(arr, arr.length));
    }
}
