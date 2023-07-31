import java.util.HashMap;

public class AreArraysEqual {

    public boolean isEqual(long A[], long B[], int N){
        HashMap<Long, Integer> count = new HashMap<>(N);
        for(int i=0; i<N; i++){
            if(count.containsKey(A[i])){
                count.put(A[i], count.get(A[i]) + 1);
            }else {
                count.put(A[i], 1);
            }
        }

        for(int i=0; i<N; i++){
            if(count.containsKey(B[i])){
                count.put(B[i], count.get(B[i])-1);
            }else{
            return false;
            }
        }

        for(long key : count.keySet())
        if(!(count.get(key) == 0)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long[] A= {1,2,33,33,5};
        long[] B= {1,3,5,4,4};
        AreArraysEqual areArraysEqual = new AreArraysEqual();
        System.out.println(areArraysEqual.isEqual(A, B, A.length));
    }

}
