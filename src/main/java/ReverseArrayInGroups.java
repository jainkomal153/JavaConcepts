import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseArrayInGroups {

    public void reverseInGroup(ArrayList<Integer> arr, int n, int k){
        if(n<k){
            k=n;
        }

        int head = 0;
        int tail = k-1;
        while(head<n) {
            reverse(arr, head, tail);
            head = tail+1;
            tail = head + k-1;

            if(n-1<tail){
                tail = n-1;
            }
        }
    }

    public void reverse(ArrayList<Integer> arr, int head, int tail){
        while(head<=tail){
            int temp = arr.get(head);
            arr.set(head, arr.get(tail));
            arr.set(tail, temp);
            head++;
            tail --;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1));
        ReverseArrayInGroups reverseArrayInGroups = new ReverseArrayInGroups();
        reverseArrayInGroups.reverseInGroup(arr, arr.size(),3);
        System.out.println(arr);
    }
}
