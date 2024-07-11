public class FindPeakElement {

    public int peakElement(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        int head=0;
        int tail = n-1;
        while(head <= tail){
            int mid= head + (head+tail)/2;
            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[mid]< arr[mid+1]){
                head = mid;
            }
            else if(arr[mid] < arr[mid-1]){
                tail = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3};
        FindPeakElement findPeakElement = new FindPeakElement();
        System.out.println(findPeakElement.peakElement(arr, arr.length));
    }
}
