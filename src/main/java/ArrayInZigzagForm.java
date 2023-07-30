public class ArrayInZigzagForm {

    public void transform(int[] arr, int n){
        int head = 0;
        int tail = head+1;
        while(tail < n){
            if(arr[head] > arr[tail]) {
                swap(arr, head, tail);
            }
                head++;
                tail++;
            if(tail <n && arr[head] < arr[tail]){
                swap(arr, head, tail);
            }
            head++;
            tail++;
        }
    }
    public void swap(int[] arr, int head, int tail){
        int temp = arr[head];
        arr[head] = arr[tail];
        arr[tail] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        ArrayInZigzagForm arrayInZigzagForm = new ArrayInZigzagForm();
        arrayInZigzagForm.transform(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
