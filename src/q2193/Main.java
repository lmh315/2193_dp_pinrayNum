package q2193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static long[][] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		memo = new long[N + 1][2];
		int i;

		memo[1][0] = 0;
		memo[1][1] = 1;

		for (i = 2; i <= N; i++) {
			memo[i][0] = memo[i - 1][0] + memo[i - 1][1];
			memo[i][1] = memo[i - 1][0];
		}

		System.out.println(memo[N][0] + memo[N][1]);
		br.close();
	}
}
