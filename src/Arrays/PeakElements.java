package Arrays;

import java.util.ArrayList;
import java.util.List;

// problem
// https://leetcode.com/problems/find-the-peaks/

public class PeakElements {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(peakElements(arr));
    }

    ///////// solution ///////////////
    private static List<Integer> peakElements(int[] mountain){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i + 1]){
                list.add(i);
            }
        }
        return list;
    }
}
