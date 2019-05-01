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

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int numberOfBribes = 0;
		for (int currentPosition = 0; currentPosition < q.length; currentPosition++) {
			int currentPerson = q[currentPosition] - 1;
			if (currentPerson > currentPosition + 2) {
				System.out.println("Too chaotic");
				return;
			}
			
			for (int i = currentPerson - 1; i <= currentPosition - 1; i++) {
				if (i < 0) {
					continue;
				}
				if (q[i] > currentPerson) {
					numberOfBribes++;
				}
			}
			
		}

		System.out.println(numberOfBribes);

	}

	public static void main(String[] args) throws IOException{
		List<String> lines = Files.readAllLines(Paths.get(new File("").getAbsolutePath() + "\\src\\input.txt"));
		lines.remove(0);
		
		while (lines.size() > 0) {
			int queueSize = Integer.parseInt(lines.get(0));
			int[] q = new int[queueSize];
			String[] splitLine = lines.get(1).split(" ");
			for (int i = 0; i < queueSize; i++) {
				q[i] = Integer.parseInt(splitLine[i]);
			}
			minimumBribes(q);
			lines.remove(0);
			lines.remove(0);
		}
	}
}
