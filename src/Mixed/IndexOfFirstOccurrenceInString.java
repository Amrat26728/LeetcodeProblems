package Mixed;

public class IndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "leet";
        String needle = "leeto";
        System.out.println(findFirstOccurrence(haystack, needle));
    }

    static int findFirstOccurrence(String haystack, String needle){
        int haystackPointer = 0;
        int needlePointer = 0;
        int firstOccur = -1;

        while(needlePointer <= needle.length() - 1 && haystackPointer <= haystack.length() - 1){
            if(haystack.charAt(haystackPointer) == needle.charAt(needlePointer)){
                if (firstOccur == -1){
                    firstOccur = haystackPointer;
                }
                haystackPointer++;
                needlePointer++;
            }else{
                needlePointer = 0;
                firstOccur = -1;
            }
        }
        return firstOccur;
    }
}
