import java.util.*;

public class FindIntersection {

//    public ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3){
//        ArrayList<Integer> result = new ArrayList<>(Math.min(n1, n2));
//        int i = 0,j =0;
//        while(i<n1 && j<n2){
//            if(A[i] == B[j]){
//                if(result.size()<1 || result.get(result.size()-1) != A[i]){
//                    result.add(A[i]);
//                }
//                i++;
//                j++;
//            }else if(A[i]< B[j]){
//                i++;
//            }else{
//                j++;
//            }
//        }
//        System.out.println(result.toString());
//        i =j =0;
//        while(i<result.size() && j<n3){
//            if(result.get(i) == C[j]){
//                i++;
//                j++;
//            }else if(result.get(i) < C[j]){
//                result.remove(i);
//            }else{
//                j++;
//            }
//        }
//        while(i<result.size()){
//            result.remove(i);
//        }
//        if(result.isEmpty()){
//            result.add(-1);
//        }
//        return result;
//    }


    public ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3){
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> setC = new HashSet<>();
        for(int a: A){
            setA.add(a);
        }
        for(int b: B){
            setB.add(b);
        }
        for(int c: C){
            setC.add(c);
        }
            setA.retainAll(setB);
        setA.retainAll(setC);
        ArrayList<Integer> result = new ArrayList<>(setA);
        if(result.isEmpty()){
            result.add(-1);
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] A= {-99,-98,-95,-94,-92,-91,-88,-84,-84,-84,-79,-78,-78,-75,-74,-73,-72,-70,-67,-62,-60,-55,-53,-50,-49,-49,-48,-47,-47,-45,-43,-42,-41,-39,-38,-33,-32,-24,-22,-19,-19,-19,-18,-16,-12,-9,-7,-5,-5,-5,-4,-2,0,3,5,7,8,10,11,21,22,36,36,37,37,41,50,50,51,53,57,63,63,64,66,66,66,67,73,73,75,77,77,80,81,82,83,83,85,85,86,86,89,92,93,96};
        int[] B= {-95,-83,-80,-79,-78,-77,-69,-67,-66,-65,-63,-63,-61,-60,-55,-52,-50,-49,-48,-46,-46,-42,-41,-33,-30,-28,-26,-26,-18,-17,-14,-13,-13,-11,-11,-10,-7,-7,-7,-6,-3,0,0,2,5,5,6,11,11,11,17,18,18,20,24,24,32,36,36,39,41,41,47,47,48,50,51,53,54,55,56,56,62,62,63,63,64,66,71,71,71,76,82,84,86,96};
        int[] C= {36,36};

        FindIntersection findIntersection = new FindIntersection();
        System.out.println(findIntersection.commonElements(A,B,C,A.length, B.length,C.length).toString());
    }
}
