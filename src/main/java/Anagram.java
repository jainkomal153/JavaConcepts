import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Anagram {

    public boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>(a.length());
        for(int i=0; i<a.length(); i++){
            if(map.containsKey(a.charAt(i))){
                int count = map.get(a.charAt(i));
                map.put(a.charAt(i), count+1);
            }else{
                map.put(a.charAt(i), 1);
            }
        }
        for(int i=0; i<b.length(); i++){
            if(!map.containsKey(b.charAt(i))){
                return false;
            }
            int count = map.get(b.charAt(i));
            if(count-1 == 0){
                map.remove(b.charAt(i));
            } else {
                map.put(b.charAt(i), count - 1);
            }
        }
        if(!map.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a ="tgzonrrftzq";
        String b = "tqzzrtnrftg";
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(a, b));
    }
}
