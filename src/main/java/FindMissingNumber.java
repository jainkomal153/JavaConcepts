import java.util.Arrays;

public class FindMissingNumber {

    public int missingNumber(int[] array, int n){
        Arrays.sort(array);
        for(int i=0; i<n-1; i++){
            if(!(array[i] == i+1)){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1};
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        System.out.println(findMissingNumber.missingNumber(array, array.length+1));
    }
}
