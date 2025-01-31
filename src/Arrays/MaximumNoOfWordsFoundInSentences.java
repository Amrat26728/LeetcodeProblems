package Arrays;

// problem
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class MaximumNoOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] str = {"alice and bob love leetcode somethinw rijer", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));
    }

    ////////// solution ////////////////
    private static int mostWordsFound(String[] sentences){
        int maxWords = 0;
        for (String sentence : sentences) {
            int count = 0;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    count++;
                }
            }
            if (count + 1 > maxWords) {
                maxWords = count + 1;
            }
        }
        return maxWords;
    }
}
