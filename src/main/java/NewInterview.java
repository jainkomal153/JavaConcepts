import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class NewInterview {

    private HashMap<Character, Integer> calculateFrequency(String word){
        char[] alphabets = word.toCharArray();
        HashMap<Character, Integer> frequencyMap = new LinkedHashMap<>(word.length());
        for(char alphabet: alphabets){
            if(frequencyMap.containsKey(alphabet)){
                frequencyMap.put(alphabet, frequencyMap.get(alphabet)+1 );
            }
            frequencyMap.put(alphabet, 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String word = "elephant";
        NewInterview newInterview = new NewInterview();
        HashMap<Character, Integer> frequencyMap = newInterview.calculateFrequency(word);
        for(frequencyMap.entrySet()){
            System.out.println(frequencyMap.get(alphabet));
        }
    }
}
