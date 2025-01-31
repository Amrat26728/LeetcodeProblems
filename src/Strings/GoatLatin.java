package Strings;

// problem
// https://leetcode.com/problems/goat-latin/

public class GoatLatin {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(sentence));
    }

    public static String toGoatLatin(String sentence){
        String[] arr = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        StringBuilder ans = new StringBuilder();
        int times = 1;
        for(String s: arr){
            if (vowels.contains(s.substring(0, 1))){
                s = s.concat("ma");
            }else{
                String firstChar = s.substring(0,1);
                s = s.substring(1);
                s = s.concat(firstChar).concat("ma");
            }
            s = addA(s, times);
            ans.append(s);
            if (times != arr.length){
                ans.append(" ");
            }
            times++;
        }
        return ans.toString();
    }
    private static String addA(String s, int times){
        for (int i = 0; i < times; i++) {
            s = s.concat("a");
        }
        return s;
    }
}
