package Arrays;

// problem
// https://leetcode.com/problems/count-tested-devices-after-test-operations/

public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,3};
        System.out.println(countTestedDevices(arr));
    }

    public static int countTestedDevices(int[] batteryPercentages){
        int count = 0;
        for (int batteryPercentage: batteryPercentages){
            if (batteryPercentage > count){
                count++;
            }
        }
        return count;
    }
}
