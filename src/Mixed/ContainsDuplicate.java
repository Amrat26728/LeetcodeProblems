package Mixed;

import java.util.HashSet;

// solved
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};

        System.out.println(duplicateExists(arr));
    }

    static boolean duplicateExists(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        boolean exists = false;
        for(int val: nums){
            if(set.contains(val)){
                exists = true;
                break;
            }else{
                set.add(val);
            }
        }
        return exists;
    }
}
