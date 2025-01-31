package Strings;

// problem
// https://leetcode.com/problems/circular-sentence/

public class CircularSentence {
    public static void main(String[] args) {
        String sentence = "Leetcode is cool";
        System.out.println(isCircularSentence(sentence));
    }

    public static boolean isCircularSentence(String sentence){
        String[] arr = sentence.split(" ");
        if (sentence.charAt(0) != sentence.charAt(sentence.length()-1)){
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            char end = arr[i].charAt(arr[i].length() - 1);
            char start = arr[i+1].charAt(0);
            if (end != start) return false;
        }
        return true;
    }
}
