package Mixed;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};

//        int count = pairs(arr);

        // formula total no of pairs of particular number
//        int pairs = count * (count - 1) / 2;
        System.out.println(numIdenticalPairs(arr));
    }

    static int numIdenticalPairs(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }


//    static int pairs(int[] nums){
//        int count = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] == 1){
//                count++;
//            }
//        }
//        return count;
//    }
}
