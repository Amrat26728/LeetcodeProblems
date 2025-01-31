package Math;

// problem
// https://leetcode.com/problems/pass-the-pillow/

public class PassPillow {
    public static void main(String[] args) {
        int n = 10;
        int times = 78;
        System.out.println(passThePillow(n, times));
    }

    public static int passThePillow(int n, int times){
        int rem = times % (n-1);
        int rounds = times / (n-1);
        if (rounds % 2 == 0){
            return rem+1;
        }
        return n-rem;
    }
}
