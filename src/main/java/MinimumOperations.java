public class MinimumOperations {

    public int minOperations(int n){
        int noOfOperations =0;
        while(n>0){
            if(n%2==0){
                n = n/2;
                noOfOperations++;
            }else{
                n = n-1;
                noOfOperations++;
            }
        }
        return noOfOperations;
    }

    public static void main(String[] args) {
        int n = 7;
        MinimumOperations minimumOperations = new MinimumOperations();
        System.out.println(minimumOperations.minOperations(n));
    }
}
