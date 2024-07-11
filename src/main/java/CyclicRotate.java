public class CyclicRotate {

    public static void rotateBy1(int arr[], int n){
        int i = 0;
        int j=n-1;
        int temp;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void rotateByk(int arr[], int k){
        int i = 0;
        int j=(arr.length-k);
        int temp;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            if(j != arr.length-1){j++;}
        }
    }

//    1,2,3,4,5
//
//    3,4,5,1,2

//    3,2,1,4,5
//    3,4,1,2,5
//

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
//        rotateBy1(A,A.length);
        rotateByk(A, 2);
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
