package Strings;

// problem
// https://leetcode.com/problems/faulty-keyboard/

public class FaultyKeyboard {
    public static void main(String[] args) {
        String s = "poiinter";
        System.out.println(finalString(s));
    }

    ///////// solution //////////
    public static String finalString(String s){
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i'){
                int start = 0;
                int end = str.length() - 1;
                String ss = "";
                for (int j = str.length() - 1; j >= 0; j--) {
                    ss = ss.concat(str.substring(j, j + 1));
                }
                str = ss;
            }else{
                str = str.concat(s.substring(i, i+1));
            }
        }
        return str;
    }
}
