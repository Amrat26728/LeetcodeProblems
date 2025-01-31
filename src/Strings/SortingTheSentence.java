package Strings;

// problem
// https://leetcode.com/problems/sorting-the-sentence/

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "Amrat1 name2";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s){
        String[] arr = s.split(" ");
        String digits = "123456789";
        for (int i = 0; i < arr.length; i++) {
            int index = digits.indexOf(arr[i].charAt(arr[i].length() - 1));
            while (index != i){
                String temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index = digits.indexOf(arr[i].charAt(arr[i].length() - 1));
            }
        }
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans = ans.concat(arr[i].substring(0, arr[i].length() - 1));
            if (i != arr.length - 1){
                ans = ans.concat(" ");
            }
        }
        return ans;
    }
}
