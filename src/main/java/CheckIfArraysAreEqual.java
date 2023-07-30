import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class CheckIfArraysAreEqual {

    public boolean isEqual(long A[], long B[], int N){
        Arrays.sort(A);
        Arrays.sort(B);
        return true;
    }
    public static void main(String[] args) {
        long A[] ={1,2,5};
        long B[]= {2,4,15};
        CheckIfArraysAreEqual checkIfArraysAreEqual= new CheckIfArraysAreEqual();
        System.out.println(checkIfArraysAreEqual.isEqual(A,B,A.length));

    }
}
