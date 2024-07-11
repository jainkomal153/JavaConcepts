public class FindLargestNumber {

    private int largest(int numbers[], int n)
    {
        int largestNum = 0;
        for(int i=0; i<n; i++){
            if(largestNum < numbers[i]){
                largestNum = numbers[i];
            }
        }
        return largestNum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 8, 7, 56, 90};
        FindLargestNumber findLargestNumber = new FindLargestNumber();
        System.out.println(findLargestNumber.largest(numbers, numbers.length));
    }
}
