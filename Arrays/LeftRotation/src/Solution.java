import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		while (d > 0) {
			int tempValue = a[0];
			for (int i = 1; i < a.length; i++) {
				a[i - 1] = a[i];
			}
			a[a.length - 1] = tempValue;
			d--;
		}

		return a;



	}

	public static void main(String[] args) throws IOException {
		int[] a = new int[] {1,2,3,4,5};
		int d = 4;
		
		int[] result = rotLeft(a, d);
		System.out.println("Done!");

	}
}
