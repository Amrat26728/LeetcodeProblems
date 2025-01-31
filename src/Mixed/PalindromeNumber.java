package Mixed;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int x){
        String num = Integer.toString(x);
        int leftPointer = 0;
        int rightPointer = num.length() - 1;
        while(leftPointer <= rightPointer){
            if(num.charAt(leftPointer) != num.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
