package Strings;

// problem
// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

public class CheckIfWordOccursAsPrefixOfAnyWordInSentence {
    public static void main(String[] args) {
        String sentence = "this problem is an easy problem";
        String searchWord = "prob";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }

    public static int isPrefixOfWord(String sentence, String searchWord){
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
