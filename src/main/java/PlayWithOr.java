public class PlayWithOr {

    private int[] game_with_number (int arr[], int n) {
        if(n <= 1){
            return arr;
        }
        int head = 0;
        while(head < n-1){
            arr[head] = arr[head] | arr[head+1];
            head++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 6};
        PlayWithOr playWithOr = new PlayWithOr();
        playWithOr.game_with_number(arr, arr.length);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
