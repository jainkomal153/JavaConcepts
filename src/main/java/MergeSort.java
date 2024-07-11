import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    private void sort(ArrayList<Integer> numbers){
        if (numbers.size()==1){
            return;
        }
        int head = 0;
        int tail = numbers.size() -1;
        int mid = (head + tail) /2;

    }

    private void merge(ArrayList<Integer> numbers, int head, int tail){
        if (numbers.get(head) > numbers.get(tail)){

        }
//        merge();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,1,0));
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(numbers);

        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
