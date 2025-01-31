package Arrays;

// problem
// https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.ArrayList;
import java.util.List;

public class CheckNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    //////////////////// solution ///////////////////////
    public static boolean checkIfExist(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int ele : arr) {
            if (list.contains(ele * 2)) {
                return true;
            }
            if (ele % 2 == 0 && list.contains(ele / 2)) {
                return true;
            }
            list.add(ele);
        }
        return false;
    }
}
