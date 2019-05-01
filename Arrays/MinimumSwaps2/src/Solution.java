import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int swaps = 0;
		for (int firstPosition = 0; firstPosition < arr.length - 1; firstPosition++) {
			int numberAtFirstPosition = arr[firstPosition]; 
			if (numberAtFirstPosition != firstPosition + 1) {
				for (int secondPosition = firstPosition + 1; secondPosition < arr.length; secondPosition++) {
					int numberAtSecondPosition = arr[secondPosition];
					if (numberAtSecondPosition == firstPosition + 1) {
						arr[secondPosition] = numberAtFirstPosition;
						arr[firstPosition] = numberAtSecondPosition;
						swaps++;
						break;
					}
				}
			}
		}
		
		return swaps;
	}


	public static void main(String[] args) throws IOException {
		int[] arr = new int[] {2, 3, 4, 1, 5};
		
		int res = minimumSwaps(arr);
		System.out.println(res);
		System.out.println("Done!");
	}
}
