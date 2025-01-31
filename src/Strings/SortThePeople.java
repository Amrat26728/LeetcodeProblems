package Strings;

// problem
// https://leetcode.com/problems/sort-the-people/

import java.util.Arrays;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Amrat", "Noman", "Kailash", "Jairam", "Ibad", "Airaf"};
        int[] heights = {20, 40, 60, 80, 100, 120};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights){
        for (int i = 0; i < heights.length - 1; i++) {
            int tallest = heights[i];
            int index = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (tallest < heights[j]){
                    tallest = heights[j];
                    index = j;
                }
            }
            // swap names
            String temp = names[i];
            names[i] = names[index];
            names[index] = temp;

            // swap heights
            int h = heights[i];
            heights[i] = heights[index];
            heights[index] = h;
        }
        return names;
    }
}
