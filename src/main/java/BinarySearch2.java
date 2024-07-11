public class BinarySearch2 {

    private int search(int arr[], int N, int K){
        if(N==1){
            return arr[0] == K ? 1 : -1;
        }
        int head=0, tail= N-1;

        while(head<=tail){
            int mid = (head + tail)/2;
            if(arr[mid] > K){
                tail = mid-1;
            } else if (arr[mid] < K) {
                head =  mid +1;
            }else{
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        BinarySearch2 binarySearch2 = new BinarySearch2();
        System.out.println(binarySearch2.search(arr, arr.length, 1));
    }
}
