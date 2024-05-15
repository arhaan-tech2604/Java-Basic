package com.array;

import java.util.Arrays;

public class Duplicate2DArray {
	public static void main(String[] args) {
		
        int[][] a = { {1, 2, 3, 4, 5, 6}, {1, 5, 3, 5, 6} };

        System.out.println("Duplicates found:");

        // Iterate through each row of the array
        for (int i = 0; i < a.length; i++) {
            // Iterate through each element of the row
            for (int j = 0; j < a[i].length; j++) {
                // Compare the current element with elements ahead in the row
                for (int k = j + 1; k < a[i].length; k++) {
                    // Check if a duplicate is found
                    if (a[i][j] == a[i][k]) {
                        System.out.println(a[i][j]);
                        break; // No need to continue checking duplicates for this element
                    }
                }
            }
        }
	}
}