package Math;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n){
        // method 1
        boolean[] arr = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    arr[i*j] = true;
                }
            }
        }

        return count;


        // method 2
//        if (n < 2){
//            return 0;
//        }
//        boolean[] arr = new boolean[n-2];
//        int sqrt = (int) Math.sqrt(n);
//        int count = 0;
//        for (int i = 2; i <= sqrt; i++) {
//            if (!arr[i-2]){
//                count++;
//                for (int j = i-1; j < arr.length; j++) {
//                    int nm = j+2;
//                    if (nm % i == 0){
//                        arr[j] = true;
//                    }
//                }
//            }
//        }
//        for (int i = sqrt-1; i < arr.length; i++) {
//            if (!arr[i]){
//                count++;
//            }
//        }
//        return count;
    }
}
