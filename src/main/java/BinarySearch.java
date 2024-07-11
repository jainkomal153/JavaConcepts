import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {

    private int search(ArrayList<Integer> list, int n){
        int head = 0;
        int tail = list.size()-1;

        if(head == tail){
            return list.get(head)==n ? head : -1;
        }

        while(head <= tail){
            int mid = (tail+head) / 2;
            if(list.get(mid) > n){
                tail = mid -1;
            }
            else if (list.get(mid) < n) {
                head = mid +1;
            } else if (list.get(mid) == n) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(list, 10));
    }
}
