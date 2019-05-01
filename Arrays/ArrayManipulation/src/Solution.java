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

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {
		long[] array = new long[n];
		
		for (int[] query : queries) {
			int a = query[0];
			int b = query[1];
			int k = query[2];
			
			array[a - 1] += k;
			if (b < n) {
				array[b] -= k;
			}
		}

		long maxValue = 0;
		long runningTotal = 0;
		
		for (long value : array) {
			runningTotal += value;
			if (runningTotal > maxValue) {
				maxValue = runningTotal;
			}
		}
		
		return maxValue;


	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "\\src\\input.txt"));
		String firstLine = lines.get(0);
		int arraySize = Integer.parseInt(firstLine.split(" ")[0]);
		int numberOfQueries = Integer.parseInt(firstLine.split(" ")[1]);

		int[][] queries = new int[numberOfQueries][];
		
		lines.remove(0);
		int i = 0;
		for (String line : lines) {
			String[] splitLine = line.split(" ");
			int a = Integer.parseInt(splitLine[0]);
			int b = Integer.parseInt(splitLine[1]);
			int k = Integer.parseInt(splitLine[2]);
			
			queries[i] = new int[] {a, b, k};
			i++;
		}

		long result = arrayManipulation(arraySize, queries);
		System.out.println(result);
		System.out.println("Done!");

	}
}
