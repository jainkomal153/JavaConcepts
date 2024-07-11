public class PrimeNumber {

    private boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n==2){return true;}
        if(n%2 == 0){return false;}
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        PrimeNumber primeNumber = new PrimeNumber();
        if(primeNumber.isPrime(n)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
