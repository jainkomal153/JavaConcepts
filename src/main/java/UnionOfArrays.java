import java.util.HashSet;

public class UnionOfArrays {

        public int doUnion(int a[], int n, int b[], int m){
            HashSet<Integer> union = new HashSet<>(n+m);
            for (int element: a) {
                union.add(element);
            }
            for (int element: b) {
                union.add(element);
            }

            System.out.println(union);
            return union.size();
        }


        public static void main(String[] args) {
            int a[] = {1,2,3,4,5};
            int b[] ={1,2,3};
            UnionOfArrays unionOfArrays = new UnionOfArrays();
            System.out.println(unionOfArrays.doUnion(a,a.length, b, b.length));
        }

}
