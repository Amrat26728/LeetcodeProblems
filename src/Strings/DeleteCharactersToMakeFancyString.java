package Strings;

// problem
// https://leetcode.com/problems/delete-characters-to-make-fancy-string/

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        String s = "aaac";
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s){
        if (s.length() <= 2){
            return s;
        }
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) != s.charAt(i+1)){
                count++;
                if (count > 2){
                    ans.append(s.substring(i,i+1).repeat(2));
                }else{
                    ans.append(s.substring(i,i+1).repeat(count));
                }
                count = 0;
            }else{
                count++;
            }
        }
        if (s.charAt(s.length()-1) != s.charAt(s.length()-2)){
            ans.append(s.charAt(s.length()-1));
        }else{
            count++;
            if (count < 2){
                ans.append(s.substring(s.length()-1).repeat(count));
            }else{
                ans.append(s.substring(s.length()-1).repeat(2));
            }
        }

        return ans.toString();
    }
}
