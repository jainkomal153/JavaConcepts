public class subsetofArray {

    public String isSubset( long a1[], long a2[], long n, long m) {
        long[] min, max;
        if(n<m){
            min = a1;
            max = a2;
        }else{
            min= a2;
            max = a1;
        }
        int i =0, j=0;

        while(i< min.length){
            while(j< max.length){
                if(min[i] ==  max[j]){
                    max[j] = -1;
                    i++;
                    j=0;
                    break;
                }else{
                    j++;
                }
            }
            if(j>=max.length){return "no";}
        }
        return "yes";
    }

    public static void main(String[] args) {
        long[] a1 = {10, 5, 2, 23, 19};
        long[] a2 = {19, 5, 3};
        subsetofArray subsetofArray = new subsetofArray();
        System.out.println(subsetofArray.isSubset(a1, a2, a1.length, a2.length));
    }
}
