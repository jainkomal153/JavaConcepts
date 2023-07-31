public class SearchElementInArray {

    public int search(int[] arr, int N, int X){
        for(int i=0; i<N; i++){
            if(arr[i]==X){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int X=7;
        SearchElementInArray searchElementInArray = new SearchElementInArray();
        System.out.println(searchElementInArray.search(arr,arr.length, X));
    }
}
