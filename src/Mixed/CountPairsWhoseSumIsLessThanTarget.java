package Mixed;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        int[] arr = {-6,2,5,-2,-7,-1,3};
        int target = -2;
        System.out.println(countPairs(arr, target));
    }

    static int countPairs(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] < target){
                    count++;
                }
            }
        }
        return  count;
    }
}
