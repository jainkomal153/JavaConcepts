public class CyclicRotateByOne {

    public void rotate(int arr[], int n){
        for(int i=0; i<n; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1]= temp;
        }
    }


    public static void main(String[] args) {
        int[] arr ={9, 8, 7, 6, 4, 2, 1, 3};
        CyclicRotateByOne cyclicRotateByOne = new CyclicRotateByOne();
        cyclicRotateByOne.rotate(arr, arr.length);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
