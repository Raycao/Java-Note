package ch9;

import java.util.*;

class ReversedStringOrder implements Comparator<String> {
    //範例中ReverseedStringOrder實作Comparator介面
	//並且有加上需求類型，即角括號內的String型態
	@Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] words = {"B", "X", "A", "M", "F", "W", "O"};
        Arrays.sort(words, new ReversedStringOrder());
        for(String word : words) {
            System.out.println(word);
        }
    }
}
