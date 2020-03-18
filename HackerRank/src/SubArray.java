import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
class SubArray
{
	// Generic function to get sub-array of a non-primitive array
	// between specified indices
	public static<T> int[] subArray(int[] arr, int beg, int end) {
		return Arrays.copyOfRange(arr, beg, end + 1);
	}
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int N = in.nextInt();
		in.nextLine();
		int[] arr = new int[N];
		for (int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		int negative=0;
		int positive = 0;
		
	for (int j = 0;j<arr.length;j++) {
		for (int i=0;i<arr.length;i++) {
			int beg=i,end=i+j;
			if (end>=arr.length) {
				break;
			}
			int[] subarray = subArray(arr, beg, end);
			int sum = IntStream.of(subarray).sum();
			if (sum<0) {
				negative++;
			}
			else {
				positive++;
			}
			System.out.print(sum + " ");
		}
		System.out.println();
	}
	System.out.println("Negative count : " + negative);
	System.out.println("Positive count: " + positive);
  }
}