package Strings;

// problem
// https://leetcode.com/problems/kth-distinct-string-in-an-array/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }

    public static String kthDistinct(String[] arr, int k){
        List<String> unique = new ArrayList<>();
        List<String> check = new ArrayList<>();
        for (String s: arr){
            if (!check.contains(s)){
                unique.add(s);
                check.add(s);
            }else{
                unique.remove(s);
            }
        }
        if (k > unique.size()){
            return "";
        }
        return unique.get(k-1);
    }
}
