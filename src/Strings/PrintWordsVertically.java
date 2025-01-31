package Strings;

// problem
// https://leetcode.com/problems/print-words-vertically/

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        String s = "is this";
        System.out.println(printVertically(s));
    }

    public static List<String> printVertically(String s){
        String[] arr = s.split(" ");
        int longest = arr[0].length();
        List<String> ans = new ArrayList<>();
        for (int i = 1; i < arr.length; i++){
            if (arr[i].length() > longest){
                longest = arr[i].length();
            }
        }
        for (int i = 0; i < longest; i++) {
            StringBuilder word = new StringBuilder();
            for (String w: arr){
                if (i >= w.length()){
                    word.append(" ");
                }else{
                    word.append(w.charAt(i));
                }
            }
            String strWord = word.toString();
            for (int j = strWord.length() - 1; j >= 0; j--) {
                if (strWord.charAt(j) != ' '){
                    strWord = strWord.substring(0, j+1);
                    break;
                }
            }
            ans.add(strWord);
        }
        return ans;
    }
}
