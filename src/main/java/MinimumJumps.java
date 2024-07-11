import java.util.Arrays;

public class MinimumJumps {

//    private int minJumps(int[] arr) {
//        if(arr.length <= 1){
//            return 0;
//        }
//        int noOfJumps =0;
//        int head = 0;
//        int tail = 0;
//
//        while(tail < arr.length){
//            if(arr[head] == 0){
//                return -1;
//            }
//            tail = tail + arr[head] ;
//            if (!(tail >= arr.length)){
//                head = fetchHighestIndex(head+1, tail, arr);
//            }
//            noOfJumps++;
//        }
//
//        return noOfJumps;
//    }
//
////    [5,6,7]
//
    private int fetchHighestIndex(int head, int tail, int[] arr){
        int highestNumber = arr[head];
        int highestIndex = head;
        while(head<=tail){
            if (Math.max(highestNumber, arr[head]) == arr[head]){
                highestNumber = arr[head];
                highestIndex = head;
            }
            head++;
        }
        System.out.println(highestIndex);
        return highestIndex;
    }


    private int minJumps(int[] arr){
        int noOfJumps = 0;
        int[] array = new int[arr.length];
        if(arr.length <= 1){
            return noOfJumps;
        }
        int head = 0;
        while(arr[head] != 0 && head <arr.length){

            head = head + arr[head];

        }
        if(arr[head] == 0){return -1;}
        return noOfJumps;
    }
    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 8, 9, 2, 6, 7, 6, 8, 9};
//        int[] arr = {1 ,0 ,1 ,2 ,3 ,4 ,8 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 1};
        int[] arr = {1,1};
                MinimumJumps minimumJumps = new MinimumJumps();
        System.out.println(minimumJumps.minJumps(arr));
    }
}
