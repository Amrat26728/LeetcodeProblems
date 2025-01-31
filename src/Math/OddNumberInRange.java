package Math;

public class OddNumberInRange {
    public static void main(String[] args) {
        int low = 0;
        int high = 1000000000;
        System.out.println(countOdds(low, high));
    }

    static int countOdds(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                count++;
            }
        }
        return count;
    }
}

