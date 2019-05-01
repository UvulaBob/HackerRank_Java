import java.io.*;
import java.math.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		
				
		int maxSum = -9 * 36;

		for (int row = 0; row <= 3; row++) {
			for (int column = 0; column <= 3; column++) {
				int currentSum = 0;
				currentSum += arr[row][column];
				currentSum += arr[row][column + 1];
				currentSum += arr[row][column + 2];
				currentSum += arr[row + 1][column + 1];
				currentSum += arr[row + 2][column];
				currentSum += arr[row + 2][column + 1];
				currentSum += arr[row + 2][column + 2];
				if (currentSum > maxSum) {
					maxSum = currentSum;
				}
			}
		}
		
		return maxSum;


	}

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "\\src\\input.txt"));
		
		int[][] arr = new int[6][6];

		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			String[] arrRowItems = line.split(" ");
			
			int j = 0;
	
			for (String value : arrRowItems) {
				if (!value.equals("")) {
					int arrItem = Integer.parseInt(value);
					arr[i][j] = arrItem;
					j++;
				}
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);
		System.out.println("Done!");

	}
}
