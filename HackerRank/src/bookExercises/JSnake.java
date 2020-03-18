package bookExercises;

import java.awt.Graphics2D;
import java.util.Scanner;

public class JSnake {
	private final static Scanner in = new Scanner(System.in);

	public static void main(String s[]) {
		int n = in.nextInt();
		char[][] arr = new char[n][n];
		boardfill(arr, n);
		boardView(arr, n);
		int x = n / 2;
		int y = n / 2;
		int l = 0;
		boardSet(arr, n, x);
		while (l < n - 1 || l > 0) {
			int k = in.nextInt();
			if (k == 8) {
				x--;
				boardUp(arr, n, x, y);
				boardView(arr, n);
				if (x == n - 1 || x == 0) {
					break;
				}
			} else if (k == 2) {
				x++;
				boardDown(arr, n, x, y);
				boardView(arr, n);
				if (x == n - 1 || x == 0) {
					break;
				}
			} else if (k == 4) {
				y--;
				boardLeft(arr, n, x, y);
				boardView(arr, n);
				if (y == n - 1 || y == 0) {
					break;
				}
			} else {
				y++;
				boardRight(arr, n, x, y);
				boardView(arr, n);
				if (y == n - 1 || y == 0) {
					break;
				}
			}
		}
		System.out.println("Over");
	}

	public static void boardUp(char arr[][], int n, int x, int y) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == x + 1 && j == y) {
					arr[i][j] = (' ');
				}
				if (i == x && j == y) {
					arr[i][j] = ('S');
				}
			}
		}
	}

	public static void boardDown(char arr[][], int n, int x, int y) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == x - 1 && j == y) {
					arr[i][j] = (' ');
				}

				if (i == x && j == y) {
					arr[i][j] = ('S');
				}
			}
		}
	}

	public static void boardLeft(char arr[][], int n, int x, int y) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == y + 1 && i == x) {
					arr[i][j] = (' ');
				}
				if (j == y && i == x) {
					arr[i][j] = ('S');
				}
			}
		}
	}

	public static void boardRight(char arr[][], int n, int x, int y) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == y - 1 && i == x) {
					arr[i][j] = (' ');
				}
				if (j == y && i == x) {
					arr[i][j] = ('S');
				}
			}
		}
	}

	public static void boardSet(char arr[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == m && j == m) {
					arr[i][j] = ('S');
				}
			}
		}
	}

	public static void boardfill(char arr[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1) {
					arr[i][j] = ('\u2194');
				} else if (j == 0 || j == n - 1) {
					arr[i][j] = ('\u2195');
				} else {
					arr[i][j] = (' ');
				}

			}
		}
	}

	public static void boardView(char arr[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}