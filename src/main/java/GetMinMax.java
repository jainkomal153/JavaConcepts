public class GetMinMax {

    class Pair
    {
        long first, second;
        public Pair(long first, long second)
        {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public Pair getMinMax(long a[], long n){
        long min =a[0];
        long max=a[0];
        for(int i=0; i<n; i++){
            if (a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        Pair minMax = new Pair(min, max);
        return minMax;
    }
    public static void main(String[] args) {
        long[] a ={3, 2, 1, 56, 10000, 167};
        GetMinMax getMinMax= new GetMinMax();
        System.out.println(getMinMax.getMinMax(a, a.length));
    }
}
