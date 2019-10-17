import java.time.Duration;
import java.time.Instant;

public class Task1 {

	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int size = getArraySize(args);
		Instant before = Instant.now();

		for (int i = 0; i < 3; i++) {
			int arr[][] = createArray(size);
			double avg = calcuateArrayAverage(arr);
			printArray(arr, avg);
		}

		Instant after = Instant.now();
		long delta = Duration.between(before, after).toMillis();

		System.out.println("Time delay: " + delta);
	}

	/////////////////////////////////////////////////////////////////////////
	private static int getArraySize(String[] args) {
		int size;
		if (args.length == 0) {
			System.err.println("You should pass the array size as paramter, default value of 5 will be used");
			size = 5;
		} else {
			size = Integer.parseInt(args[0]);
		}
		return size;
	}

	///////////////////////////////////////////////////////////////////////
	private static int[][] createArray(int n) {
		int arr[][] = new int[n][n];
		for (int rowIndex = 0; rowIndex < n; rowIndex++) {			
			for (int cellIndex = 0; cellIndex < n; cellIndex++) {
				arr[rowIndex][cellIndex] = createRandomeValue();
			}
		}
		return arr;
	}

	///////////////////////////////////////////////////////////////////////
	private static void printArray(int[][] arr, double avg) {
		for (int[] row : arr) {
			for (int cell : row) {
				//System.out.print(cell + " | ");
			}
			//System.out.println();
		}
		System.out.println("Average: " + avg);
	}

	///////////////////////////////////////////////////////////////////////
	private static double calcuateArrayAverage(int[][] arr) {
		int sum = 0;
		for (int[] row : arr) {
			for (int cell : row) {
				sum += cell;
			}
		}
		int size = arr.length;
		double avg = sum / (size * size);
		return avg;
	}

	///////////////////////////////////////////////////////////////////////
	private static int createRandomeValue() {
		return (int) (Math.random() * 100);
	}
	///////////////////////////////////////////////////////////////////////
}
