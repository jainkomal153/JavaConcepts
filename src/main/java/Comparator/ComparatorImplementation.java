package Comparator;

import java.util.Comparator;

public class ComparatorImplementation implements Comparator<Integer> {
    public int compare(Integer score1, Integer score2) {
        if(score1 < score2){
            return -1;
        } else if (score1 > score2) {
            return 1;
        }
        return 0;
    }
}

