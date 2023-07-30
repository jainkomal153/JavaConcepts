import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderInArray {

    public ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leaders = new ArrayList<>(n);
        leaders.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= leaders.get(leaders.size()-1)){
                leaders.add(arr[i]);
            }
        }
        Collections.sort(leaders, Collections.reverseOrder());
        return leaders;
    }
    public static void main(String[] args) {
        int arr[] = {63 ,70 ,80 ,33 ,33 ,47 ,20};
        LeaderInArray leaderInArray = new LeaderInArray();
        ArrayList<Integer> leaders = leaderInArray.leaders(arr, arr.length);
        System.out.println(leaders.toString());
    }
}
