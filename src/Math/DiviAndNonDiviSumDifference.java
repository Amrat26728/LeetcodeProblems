package Math;

public class DiviAndNonDiviSumDifference {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        System.out.println(differenceOfSum(n, m));
    }

    static int differenceOfSum(int n, int m){
        int divSum = 0;
        int nonDivSum = 0;
        for (int i = 1; i <= n; i++){
            if (i % m == 0){
                divSum += i;
            }else{
                nonDivSum += i;
            }
        }
        return nonDivSum - divSum;
    }
}
