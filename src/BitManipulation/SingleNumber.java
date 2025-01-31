package BitManipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,1};

        System.out.println(singleNum(arr));
    }

    static int singleNum(int[] nums){
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
