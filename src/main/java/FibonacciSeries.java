public class FibonacciSeries {

    private static long[] printFibb (int n){
        long[] fibbSeries = new long[n];
//        int a= 0, b=1, c;
//        fibbSeries[0]= 1;
//        if(n==1){
//            return fibbSeries;
//        }else {
//            for(int i=1; i<n; i++){
//                c= a +b;
//                fibbSeries[i] = c;
//                a = b;
//                b= c;
//            }
//        }
        return fibbSeries;

    }

    public static void main(String[] args) {
        int n = 50;
        long[] fibb = printFibb(n);
        for(int i=0; i<n; i++){
            System.out.println(fibb[i]);
        }
    }
}
