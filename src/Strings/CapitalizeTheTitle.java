package Strings;

// problem
// https://leetcode.com/problems/capitalize-the-title/

import java.util.ArrayList;
import java.util.List;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String title = "i lOve leetcode";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title){
        StringBuilder word = new StringBuilder();
        List<String> list = new ArrayList<>();
        String ans = "";
        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' '){
                list.add(word.toString());
                word.delete(0, word.length());
            }else{
                word.append(title.charAt(i));
            }
        }
        if (!word.isEmpty()){
            list.add(word.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            String w = list.get(i);
            if (w.length() <= 2){
                w = w.toLowerCase();
            }else{
                w = w.substring(0, 1).toUpperCase().concat(w.substring(1).toLowerCase());
            }
            ans = ans.concat(w);
            if (i != list.size() - 1){
                ans = ans.concat(" ");
            }
        }
        return ans;
    }
}
