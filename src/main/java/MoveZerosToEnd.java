public class MoveZerosToEnd {

    private void pushZerosToEnd(int[] arr, int n) {
        int head = 0;
        int tail = 1;
        while(tail < n){
            if(arr[head] == 0){
                if(arr[tail] == 0){
                    tail++;
                }else{
                    arr[head] = arr[tail];
                    arr[tail] =0;
                    head++;
                    tail++;
                }
            }else{
                head++;
                tail++;
            }
        }
    }
    public static void main(String[] args) {
//        int[] arr = {0 ,0, 0, 3 ,1 ,4};
        int[] arr =  {0, 4};
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        moveZerosToEnd.pushZerosToEnd(arr, arr.length);
        for(int a: arr){
            System.out.print(a + " ");
        }




    }
}
