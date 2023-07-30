import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesInArray {

    public ArrayList<Integer> duplicates(int[] arr, int n){
        ArrayList<Integer> duplicate = new ArrayList<>(n);
        Arrays.sort(arr);
        for(int i=1; i<n; i++){
            if(arr[i-1] == arr[i]){
                if(duplicate.isEmpty()){
                    duplicate.add(arr[i-1]);
                }
                else if(duplicate.get(duplicate.size()-1)!=arr[i-1]){
                    duplicate.add(arr[i-1]);
                }
            }
        }
        if(duplicate.isEmpty()){
            duplicate.add(-1);
        }
        return duplicate;
    }

    public static void main(String[] args) {
//        int[] arr={13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19 ,20 ,2 ,4 ,25 ,14 ,23 ,14};
        int[] arr={2 ,3 ,1 ,2 ,3};
        DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
        ArrayList<Integer> duplicate = duplicatesInArray.duplicates(arr, arr.length);
        System.out.printf(duplicate.toString());
    }
}
