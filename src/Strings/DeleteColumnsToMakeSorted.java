package Strings;

// problem
// https://leetcode.com/problems/delete-columns-to-make-sorted/

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        String[] arr = {"zyx"};
        System.out.println(minDeletionSize(arr));
    }

    public static int minDeletionSize(String[] strs){
        int cols = strs[0].length();
        int count = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j-1].charAt(i) > strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
