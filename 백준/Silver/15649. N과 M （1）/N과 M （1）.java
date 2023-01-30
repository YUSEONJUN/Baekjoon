import java.util.Scanner;

public class Main {

	static int N;
	static int M;

	public static int[] arr;
	public static boolean[] visit;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		N = in.nextInt();
		M = in.nextInt();

		arr = new int[M];
		visit = new boolean[N];
		dfs(0);

	}

	public static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visit[i] = false;
			}
		}
	}

}