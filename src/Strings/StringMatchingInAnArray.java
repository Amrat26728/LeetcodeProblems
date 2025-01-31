package Strings;

// problem
// https://leetcode.com/problems/string-matching-in-an-array/

import java.util.ArrayList;
import java.util.List;

// solved with bruteforce solution
// but we  can solve it with KMP algorithm
public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] arr = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(arr));
    }

    public static List<String> stringMatching(String[] words){
        List<String> ans = new ArrayList<>();
        for (String word: words){
            for(String match: words){
                if (!word.equals(match)){
                    if (match.contains(word)){
                        ans.add(word);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
