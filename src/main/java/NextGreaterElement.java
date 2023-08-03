import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public Integer[] nextGreaterElement(ArrayList<Integer> numbers){
        Stack<Integer> stack = new Stack<>();
        Integer[] result = new Integer[numbers.size()];

        for(int i=numbers.size()-1; i>=0; i--){
            Integer currentElement = numbers.get(i);
            while( !stack.isEmpty() && stack.lastElement()< currentElement){
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.lastElement();
            stack.push(currentElement);
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,2,25));
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        Integer[] nextGreaterElements = nextGreaterElement.nextGreaterElement(numbers);
        System.out.println(Arrays.toString(nextGreaterElements));
    }
}
